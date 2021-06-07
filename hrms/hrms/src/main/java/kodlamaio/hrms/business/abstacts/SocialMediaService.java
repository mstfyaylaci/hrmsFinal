package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {

DataResult<List<SocialMedia>> getAll();
	
	Result add(SocialMedia socialMedia);
	
	DataResult<List<SocialMedia>> getByCandidateId(int candidateId);
}
