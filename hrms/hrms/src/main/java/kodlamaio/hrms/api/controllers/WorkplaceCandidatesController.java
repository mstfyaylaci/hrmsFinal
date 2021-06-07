package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.WorkplaceCandidateService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.WorkplaceCandidate;

@RestController
@RequestMapping("/api/workplaceCandidates")
public class WorkplaceCandidatesController {

	private WorkplaceCandidateService workplaceCandidateService;

	@Autowired
	public WorkplaceCandidatesController(WorkplaceCandidateService workplaceCandidateService) {
		
		this.workplaceCandidateService = workplaceCandidateService;
	}
	
	
	@GetMapping("/getall")
	
	public DataResult<List<WorkplaceCandidate>> getAll(){
			
			return this.workplaceCandidateService.getAll();
		}
		
	@PostMapping("/add")
	public Result add(@RequestBody WorkplaceCandidate workplaceCandidate) {
			
		return this.workplaceCandidateService.add(workplaceCandidate);
		}
	
@GetMapping("/getByCandidateId")
	
	public DataResult<List<WorkplaceCandidate>> getByCandidateId(@RequestParam int candidateId){
		
		return this.workplaceCandidateService.getByCandidateId(candidateId);
	}
	}
