package kodlamaio.hrms.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.AbilityCandidateService;
import kodlamaio.hrms.entities.concretes.AbilityCandidate;

@RestController
@RequestMapping("/api/abilityCandidates")
public class AbilityCandidatesController {

	 private AbilityCandidateService abilityCandidateService;

	 @Autowired
	public AbilityCandidatesController(AbilityCandidateService abilityCandidateService) {
		
		this.abilityCandidateService = abilityCandidateService;
	}
	 
	 @GetMapping("/getAll")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(abilityCandidateService.getAll());
	    }

	    @PostMapping("/add")
	    public ResponseEntity<?> add(@Valid @RequestBody AbilityCandidate abilityCandidate){
	        return ResponseEntity.ok(abilityCandidateService.add(abilityCandidate));
	    }

	    @GetMapping("/getByCandidateId")
	    public ResponseEntity<?> getByCandidateId(@RequestParam int candidateId){
	        return ResponseEntity.ok(abilityCandidateService.getByCandidateId(candidateId));
	    }
}
