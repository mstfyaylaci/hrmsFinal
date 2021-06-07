package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.LanguageLevelService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.LanguageLevel;

@RestController
@RequestMapping("/api/languageLevels")
public class LanguageLevelsController {

	private LanguageLevelService languageLevelService;

	@Autowired
	public LanguageLevelsController(LanguageLevelService languageLevelService) {
		
		this.languageLevelService = languageLevelService;
	}
	
@GetMapping("/getall")

public DataResult<List<LanguageLevel>> getAll(){
	
	return this.languageLevelService.getAll();
}


@PostMapping("/add")

public Result add(@RequestBody LanguageLevel languageLevel ) {
	
	return this.languageLevelService.add(languageLevel);
}

}
