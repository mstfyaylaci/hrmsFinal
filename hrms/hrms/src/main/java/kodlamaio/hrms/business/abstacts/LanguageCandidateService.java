package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.LanguageCandidate;


public interface LanguageCandidateService {

DataResult<List<LanguageCandidate>> getAll();
	
DataResult<List<LanguageCandidate>> getByCandidateId(int candidateId);
	
Result add(LanguageCandidate languageCandidate);
}
