package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	
	  //jobpositiondaki verileri çekiyoruz ,döndürüyoruz

DataResult<List<JobTitle>> getAll();
	
	Result add(JobTitle jobTitle);
}
