package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.AbilityCandidateService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.AbilityCandidateDao;
import kodlamaio.hrms.entities.concretes.AbilityCandidate;

@Service
public class AbilityCandidateManager implements AbilityCandidateService {

	 private AbilityCandidateDao abilityCandidateDao;
	 @Autowired
	public AbilityCandidateManager(AbilityCandidateDao abilityCandidateDao) {
		
		this.abilityCandidateDao = abilityCandidateDao;
	}

	@Override
	public DataResult<List<AbilityCandidate>> getAll() {
		return new SuccesDataResult<List<AbilityCandidate>>(abilityCandidateDao.findAll(),"kullanıcı yetenekleri listelendi");
	}

	@Override
	public DataResult<List<AbilityCandidate>> getByCandidateId(int candidateId) {
		return new SuccesDataResult<List<AbilityCandidate>>(abilityCandidateDao.getByCandidate_Id(candidateId));
	}

	@Override
	public Result add(AbilityCandidate abilityCandidate) {
		abilityCandidateDao.save(abilityCandidate);
        return new SuccesResult("başarıyla eklendi");
	}

}
