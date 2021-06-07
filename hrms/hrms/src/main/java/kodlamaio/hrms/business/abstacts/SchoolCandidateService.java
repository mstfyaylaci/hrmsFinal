package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SchoolCandidate;


public interface SchoolCandidateService {

DataResult<List<SchoolCandidate>> getAll();

DataResult<List<SchoolCandidate>> getByCandidateId(int candidateId);
	
	Result add(SchoolCandidate schoolCandidate);
}
