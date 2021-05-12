package kodlamaio.hrms.business.consretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstacts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service

public class JobPositionsManager implements JobPositionService{

	@Autowired
	private JobPositionDao JobPositionDao;
	
	
	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return JobPositionDao.findAll();
	}

}
