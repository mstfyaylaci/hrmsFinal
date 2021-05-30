package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstacts.EmployerService;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.dataAccess.abstacts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccesDataResult<List<Employer>>(employerDao.findAll(),"data listelendi");
	}

	@Override
	public DataResult<Employer> add(Employer employer) {

		if(!companyNameCheck(employer)) {
			return new ErrorDataResult<Employer>(null,"şirket ismi boş olamaz");
		}
		
		else if(!webSiteCheck(employer)) {
			return new ErrorDataResult<Employer>(null,"web site boş olamaz");
		}
		
		else if(!emailCheck(employer)) {
			
			return new ErrorDataResult<Employer>(null,"e-mail kullanılıyor");
		}
		else if(!passwordCheck(employer)) {
			
			return new ErrorDataResult<Employer>(null ,"şifre boş olamaz");
			
		}	
		else 
			this.employerDao.save(employer);
		return new SuccesDataResult<Employer>("iş veren kaydedildi");
	}

	private boolean companyNameCheck(Employer employer) {
		if(employer.getCompanyName().isBlank() || employer.getCompanyName()== null) {
			return false;
		}
		return true;
	}
	
	private boolean webSiteCheck(Employer employer) {
		
		if(employer.getWebAdress().isBlank() || employer.getWebAdress()==null) {
			return false;
		}
		return true;
	}
	
	private boolean emailCheck(Employer employer) {
		
		if( employerDao.findByEmail(employer.getEmail()).stream().count()!=0){
			return false;
		}
		return true;
	}
	
	private boolean passwordCheck(Employer employer) {
		
		if(employer.getPassword().isBlank() || employer.getPassword()==null) {
			return false;
			
		}
		return true;
	} 
	

	

	



	
}
