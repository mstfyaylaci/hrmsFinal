package kodlamaio.hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.EmployeeService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	@Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	@Override
	public  DataResult<List<Employee>> getAll() {
		
		return  new SuccesDataResult<List<Employee>>(employeeDao.findAll(),"Data Listelendi"); 
	}
	@Override
	public Result add(Employee employee) {
		
		this.employeeDao.save(employee);
		return new SuccesResult("kaydedildi");
	}
	
	

			



}
