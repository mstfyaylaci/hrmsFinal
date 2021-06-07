package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.SocialMediaService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.SocialMediaDao;

import kodlamaio.hrms.entities.concretes.SocialMedia;

@Service
public class SocialMediaManager implements SocialMediaService{

	private SocialMediaDao socialMediaDao;
	@Autowired
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public DataResult<List<SocialMedia>> getAll() {
		return new SuccesDataResult<List<SocialMedia>>(this.socialMediaDao.findAll());
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		
		this.socialMediaDao.save(socialMedia);
		return new SuccesResult("sosyal media eklendi");
		
	}

	@Override
	public DataResult<List<SocialMedia>> getByCandidateId(int candidateId) {
		return new SuccesDataResult<List<SocialMedia>>(socialMediaDao.getByCandidate_Id(candidateId));
	}

}
