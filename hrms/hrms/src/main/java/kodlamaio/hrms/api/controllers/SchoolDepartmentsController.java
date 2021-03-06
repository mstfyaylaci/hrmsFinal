package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.SchoolDepartmentService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.SchoolDepartment;

@RestController
@RequestMapping("/api/schoolDepartments")
public class SchoolDepartmentsController {

	private SchoolDepartmentService schoolDepartmentService;

	@Autowired
	public SchoolDepartmentsController(SchoolDepartmentService schoolDepartmentService) {
		super();
		this.schoolDepartmentService = schoolDepartmentService;
	}
	
	@GetMapping("getall")
	
	public DataResult<List<SchoolDepartment>> getAll(){
		return this.schoolDepartmentService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SchoolDepartment schoolDemartment) {
		
		return this.schoolDepartmentService.add(schoolDemartment);
	}
}
