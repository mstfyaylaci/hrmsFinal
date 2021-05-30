package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.CandidateService;
import kodlamaio.hrms.core.utilities.MernisService;
import kodlamaio.hrms.core.utilities.Result;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private MernisService mernisService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, MernisService mernisService) {
		super();
		this.candidateDao = candidateDao;
		this.mernisService=mernisService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {

		return new SuccesDataResult<List<Candidate>>(this.candidateDao.findAll(),"iş arayanlar");
	}

	@Override
	public Result add(Candidate cantidate) {

		if(candidateDao.findByEmail(cantidate.getEmail()).stream().count()!=0) {
			return new ErrorResult("E-mail kullanılmış");
		}
		else if(cantidate.getFirstName()== null 
				
				|| cantidate.getLastName()==null
				|| cantidate.getEmail()==null
				|| cantidate.getIdentification_number()==null) {
			return new ErrorResult("alanlar boş olamaz");
			
		}
		else {
			this.candidateDao.save(cantidate);
			return new SuccesResult("başarılı");
		}
	}

	
	
		
	

}
