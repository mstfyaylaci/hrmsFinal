package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.WorkplaceCandidate;

public interface WorkplaceCandidateService {

DataResult<List<WorkplaceCandidate>> getAll();
	
	Result add(WorkplaceCandidate workplaceCandidate);
	
	DataResult<List<WorkplaceCandidate>> getByCandidateId(int candidateId);
}
