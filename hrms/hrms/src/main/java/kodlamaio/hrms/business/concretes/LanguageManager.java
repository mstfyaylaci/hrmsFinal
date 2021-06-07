package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.LanguageService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{

	private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		
		return new SuccesDataResult<List<Language>>(this.languageDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccesResult("dil yeri eklendi");
	}

}
