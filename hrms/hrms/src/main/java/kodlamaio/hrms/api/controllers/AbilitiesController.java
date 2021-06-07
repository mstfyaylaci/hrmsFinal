package kodlamaio.hrms.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.AbilityService;
import kodlamaio.hrms.entities.concretes.Ability;

@RestController
@RequestMapping("/api/abilities")
public class AbilitiesController {

	 private AbilityService abilityService;

	 @Autowired
	public AbilitiesController(AbilityService abilityService) {
		
		this.abilityService = abilityService;
	}
	 
	 
	 @GetMapping("/getAll")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(abilityService.getAll());
	    }

	    @PostMapping("/add")
	    public ResponseEntity<?> add(@Valid @RequestBody Ability ability){
	        return ResponseEntity.ok(abilityService.add(ability));
	    }
}
