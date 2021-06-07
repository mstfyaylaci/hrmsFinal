package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.WorkplaceService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.WorkplaceDao;
import kodlamaio.hrms.entities.concretes.Workplace;

@Service
public class WorkplaceManager implements WorkplaceService{

	private WorkplaceDao workplaceDao;
	@Autowired
	public WorkplaceManager(WorkplaceDao workplaceDao) {
		
		this.workplaceDao = workplaceDao;
	}

	@Override
	public DataResult<List<Workplace>> getAll() {
		
		return new SuccesDataResult<List<Workplace>>(this.workplaceDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(Workplace workplace) {
		this.workplaceDao.save(workplace);
		return new SuccesResult("iş yeri eklendi");
	}

}
