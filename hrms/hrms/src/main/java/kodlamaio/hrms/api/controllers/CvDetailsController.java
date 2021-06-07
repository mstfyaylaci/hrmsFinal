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
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstacts.CvDetailService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.CvDetail;


@RestController
@RequestMapping("/api/cvDetails")
public class CvDetailsController {

	 private CvDetailService cvDetailService;
	 @Autowired
	public CvDetailsController(CvDetailService cvDetailService) {
		super();
		this.cvDetailService = cvDetailService;
	}
	    
	 @GetMapping("/getall")
	 public DataResult<List<CvDetail>> getAll(){
			
			return this.cvDetailService.getAll();
			}
	   
	 @PostMapping("/add")
		public Result add(@RequestBody CvDetail cvDetail) {
			
			return this.cvDetailService.add(cvDetail);
		}
	 
	   @GetMapping("/getByCandidateId")
	    public ResponseEntity<?> getByCandidateId(int candidateId){
	        return ResponseEntity.ok(cvDetailService.getByCandidateId(candidateId));
	    }
	   
	   @PostMapping("/upload")
	    public ResponseEntity<?> uploadPhoto(@RequestParam("file") MultipartFile file,@RequestParam int candidateId) {
	        return ResponseEntity.ok(cvDetailService.uploadPhoto(file,candidateId));
	    }
}
