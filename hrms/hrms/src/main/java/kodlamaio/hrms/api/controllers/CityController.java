package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.City;


@RestController
@RequestMapping("/api/cities")
public class CityController {

	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	
	public DataResult<List<City>> getAll(){
		
	return this.cityService.getAll();
	}
	
}

