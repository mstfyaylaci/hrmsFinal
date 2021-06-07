package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Language;


public interface LanguageService {

DataResult<List<Language>> getAll();
	
	Result add(Language language);
}
