package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Department;



public interface DepartmentService {

DataResult<List<Department>> getAll();
	
	Result add(Department department);
}
