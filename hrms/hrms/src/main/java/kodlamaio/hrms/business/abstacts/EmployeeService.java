package kodlamaio.hrms.business.abstacts;




import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employee;


public interface EmployeeService {

	 DataResult<List<Employee>> getAll();
	    
	 Result add(Employee employee);

	
}
