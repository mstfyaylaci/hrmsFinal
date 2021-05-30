package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdverisements")
public class JobAdveritisesController {

	private JobAdvertisementService jobAdveritisesService;

	@Autowired
	public JobAdveritisesController(JobAdvertisementService jobAdveritisesService) {
		super();
		this.jobAdveritisesService = jobAdveritisesService;
	}
	
@GetMapping("/getall")
	
	public DataResult<List<JobAdvertisement>> getAll(){
		
	return this.jobAdveritisesService.getAll();
	}

@PostMapping("/add")

	public Result add(@RequestBody  JobAdvertisement jobAdvertisement) {
	
		return this.jobAdveritisesService.add(jobAdvertisement) ;
}
}
