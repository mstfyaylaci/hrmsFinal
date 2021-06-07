package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.SchoolService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.SchoolDao;
import kodlamaio.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService{

	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> getAll() {

		return new SuccesDataResult <List<School>>(this.schoolDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccesResult("okul kaydedildi");
	}

}
