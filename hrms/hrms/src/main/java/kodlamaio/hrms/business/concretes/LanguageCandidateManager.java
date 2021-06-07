package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.LanguageCandidateService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.LanguageCandidateDao;
import kodlamaio.hrms.entities.concretes.LanguageCandidate;

@Service
public class LanguageCandidateManager implements LanguageCandidateService{

	private LanguageCandidateDao languageCandidateDao;
	@Autowired
	public LanguageCandidateManager(LanguageCandidateDao languageCandidateDao) {
		
		this.languageCandidateDao = languageCandidateDao;
	}

	@Override
	public DataResult<List<LanguageCandidate>> getAll() {
		return new SuccesDataResult<List<LanguageCandidate>>(this.languageCandidateDao.findAll(),"data listelendi");

	}

	@Override
	public DataResult<List<LanguageCandidate>> getByCandidateId(int candidateId) {
		return new SuccesDataResult<List<LanguageCandidate>>(languageCandidateDao.getByCandidate_Id(candidateId));
	}

	@Override
	public Result add(LanguageCandidate languageCandidate) {
		this.languageCandidateDao.save(languageCandidate);
		return new SuccesResult(" kaydedildi");
	}

}
