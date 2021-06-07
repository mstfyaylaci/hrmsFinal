package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.SchoolCandidateService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SchoolCandidate;


@RestController
@RequestMapping("/api/schoolCandidates")
public class SchoolCandidatesController {

	private SchoolCandidateService schoolCandidateService;

	@Autowired
	public SchoolCandidatesController(SchoolCandidateService schoolCandidateService) {
		
		this.schoolCandidateService = schoolCandidateService;
	}
	
	@GetMapping("/getall")
	
	public DataResult<List<SchoolCandidate>> getAll(){
		
		return this.schoolCandidateService.getAll();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody SchoolCandidate schoolCandidate) {
		
		return this.schoolCandidateService.add(schoolCandidate);
	}
	
	@GetMapping("/getByCandidateId")
	
	public DataResult<List<SchoolCandidate>> getByCandidateId(@RequestParam int candidateId){
		
		return this.schoolCandidateService.getByCandidateId(candidateId);
	}
	
}
