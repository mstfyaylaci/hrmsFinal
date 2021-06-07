package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.LanguageLevelService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.LanguageLevelDao;

import kodlamaio.hrms.entities.concretes.LanguageLevel;

@Service
public class LanguageLevelManager implements LanguageLevelService{

	private LanguageLevelDao languageLevelDao;
	@Autowired
	public LanguageLevelManager(LanguageLevelDao languageLevelDao) {
		
		this.languageLevelDao = languageLevelDao;
	}

	@Override
	public DataResult<List<LanguageLevel>> getAll() {
		return new SuccesDataResult<List<LanguageLevel>>(this.languageLevelDao.findAll(),"data listelendi");

	}

	@Override
	public Result add(LanguageLevel languageLevel) {
		this.languageLevelDao.save(languageLevel);
		return new SuccesResult("dil seviyesi  eklendi");
	}

}
