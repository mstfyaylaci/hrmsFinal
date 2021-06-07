package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.WorkplaceCandidateService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.WorkplaceCandidateDao;
import kodlamaio.hrms.entities.concretes.WorkplaceCandidate;

@Service
public class WorkplaceCandidateManager implements WorkplaceCandidateService {

	private WorkplaceCandidateDao workplaceCandidateDao;
	
	@Autowired
	public WorkplaceCandidateManager(WorkplaceCandidateDao workplaceCandidateDao) {
		
		this.workplaceCandidateDao = workplaceCandidateDao;
	}

	@Override
	public DataResult<List<WorkplaceCandidate>> getAll() {
		
		return new SuccesDataResult<List<WorkplaceCandidate>>(this.workplaceCandidateDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(WorkplaceCandidate workplaceCandidate) {
		
		this.workplaceCandidateDao.save(workplaceCandidate);
		return new SuccesResult("kaydedildi");
	}

	@Override
	public DataResult<List<WorkplaceCandidate>> getByCandidateId(int candidateId) {
		
		return new SuccesDataResult<List<WorkplaceCandidate>>(this.workplaceCandidateDao.getByCandidate_Id(candidateId));
	}

}
