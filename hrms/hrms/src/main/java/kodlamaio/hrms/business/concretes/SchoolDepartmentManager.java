package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.SchoolDepartmentService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.SchoolDepartmentDao;
import kodlamaio.hrms.entities.concretes.SchoolDepartment;
@Service
public class SchoolDepartmentManager implements SchoolDepartmentService{

	private SchoolDepartmentDao schoolDepartmentDao; 
	@Autowired
	public SchoolDepartmentManager(SchoolDepartmentDao schoolDepartmentDao) {
		
		
		this.schoolDepartmentDao = schoolDepartmentDao;
	}

	@Override
	public DataResult<List<SchoolDepartment>> getAll() {
		
		return new SuccesDataResult<List<SchoolDepartment>>(this.schoolDepartmentDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(SchoolDepartment schoolDemartment) {
		this.schoolDepartmentDao.save(schoolDemartment);
		return new SuccesResult("kaydedildi");
	}

}
