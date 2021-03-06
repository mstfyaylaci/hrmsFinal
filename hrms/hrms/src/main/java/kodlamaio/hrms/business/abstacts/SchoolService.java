package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.School;

public interface SchoolService {

	DataResult<List<School>> getAll();
	
	Result add(School school);
}
