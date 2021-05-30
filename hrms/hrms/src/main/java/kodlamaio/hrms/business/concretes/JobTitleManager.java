package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstacts.JobTitleService;

import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.core.utilities.results.SuccesDataResult;

import kodlamaio.hrms.dataAccess.abstacts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service //  bu kısımda verilen servisleri kullanmaya yarıyor update,delete gibi
//bu projenin ervis görevi göreceğini söylüyoruz


public class JobTitleManager implements JobTitleService{

	
	private JobTitleDao jobTitleDao;
	@Autowired// burası bize arka tarafta otomatik new'leme yapıyor 
	
	/* bu constructoru koyuyoruz çünkü başka bir dao gelirse bu kısımda tekrar Autowired yazmak yerine tek bir Autowired
	 ile bunu daha kolay yapıyoruz*/ 
	
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
		
	};
	
	
	@Override
	 public DataResult<List<JobTitle>> getAll() {
        return new SuccesDataResult <List<JobTitle>>(this.jobTitleDao.findAll(),"Data Listelendi");}



	@Override
	public DataResult<JobTitle> add(JobTitle jobTitle) {
        return new SuccesDataResult<JobTitle>(this.jobTitleDao.save(jobTitle),"iş pozisyonu eklendi");
    }
}



	//Entities'ten dataAccess'e, dataAccess'ten de JobPositions'a ulaştık
