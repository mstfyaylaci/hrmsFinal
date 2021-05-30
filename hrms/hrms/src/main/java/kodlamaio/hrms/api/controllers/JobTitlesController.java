package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.JobTitleService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;

@RestController // telefon pc tv neresi olursa olsun uyum sağlamaya yarıyor
//sen bir controllersın demek her katmanda iş yapacaksın

@RequestMapping("/api/jobpositions") // hangi yola erişeceğemizi gösteriyouz

public class JobTitlesController {
	
	private JobTitleService jobPositionService;

	@Autowired // arka planda JobPositionsSrvice için gelen menageri newler ve referansını tutar 
	public JobTitlesController(JobTitleService jobPositionService) {
		
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>>  getAll(){
		
		// JobPositionsService.getAll() derken, bu servicenin referansını tuttuğu yerden çekiyoruz getAll()'ı
		
		return this.jobPositionService.getAll();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody JobTitle jobPositon) {
		
		return jobPositionService.add(jobPositon);
	}

}
