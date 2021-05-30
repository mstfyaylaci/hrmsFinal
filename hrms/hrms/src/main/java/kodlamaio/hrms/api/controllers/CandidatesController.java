package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.CandidateService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")

public class CandidatesController {

	
	private CandidateService candidateSevice;
	
	
	@Autowired
	public CandidatesController(CandidateService candidateSevice) {
		super();
		this.candidateSevice = candidateSevice;
	}
	
	@GetMapping("getall")
	public DataResult<List<Candidate>>getAll(){
		
		return this.candidateSevice.getAll();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody Candidate candidate) {
		
		return this.candidateSevice.add(candidate);
	}
}
