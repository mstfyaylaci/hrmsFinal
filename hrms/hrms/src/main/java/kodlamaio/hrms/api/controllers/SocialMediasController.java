package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.SocialMediaService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.SocialMedia;

@RestController
@RequestMapping("/api/socialMedias")
public class SocialMediasController {

	private SocialMediaService socialMediaService;

	@Autowired
	public SocialMediasController(SocialMediaService socialMediaService) {
		
		this.socialMediaService = socialMediaService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SocialMedia>> getAll(){
		
		return this.socialMediaService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SocialMedia socialMedia) {
		
		return this.socialMediaService.add(socialMedia);
	}
	
	@GetMapping("/getByCandidateId")
    public ResponseEntity<?> getByCandidateId(@RequestParam int candidateId){
        return ResponseEntity.ok(socialMediaService.getByCandidateId(candidateId));
    }
}
