package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();

}
