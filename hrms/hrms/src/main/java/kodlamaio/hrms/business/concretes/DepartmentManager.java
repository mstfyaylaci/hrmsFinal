package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.DepartmentService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.DepartmentDao;
import kodlamaio.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService {

	private DepartmentDao departmentDao;
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		
		this.departmentDao = departmentDao;
	}

	@Override
	public DataResult<List<Department>> getAll() {
		
		return new SuccesDataResult<List<Department>>(this.departmentDao.findAll());
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccesResult("bölüm eklendi");
	}

}
