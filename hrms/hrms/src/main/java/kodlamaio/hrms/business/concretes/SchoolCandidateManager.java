package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.SchoolCandidateService;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.SchoolCandidateDao;

import kodlamaio.hrms.entities.concretes.SchoolCandidate;

@Service
public class SchoolCandidateManager implements SchoolCandidateService{

	private SchoolCandidateDao schoolCandidateDao;
	@Autowired
	public SchoolCandidateManager(SchoolCandidateDao schoolCandidateDao) {
		super();
		this.schoolCandidateDao = schoolCandidateDao;
	}
	
	@Override
	public DataResult<List<SchoolCandidate>> getAll() {
		
		return new SuccesDataResult<List<SchoolCandidate>>(this.schoolCandidateDao.findAll(),"data listelendi");
	}
	
	
	@Override
	public DataResult<List<SchoolCandidate>> getByCandidateId(int candidateId) {
		
		return new SuccesDataResult<List<SchoolCandidate>>(schoolCandidateDao.getByCandidate_Id(candidateId));
	}

	@Override
	public Result add(SchoolCandidate schoolCandidate) {
		schoolCandidateDao.save(schoolCandidate);
		return new SuccesResult("kaydedildi");
	}

	
	
	}


