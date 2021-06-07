package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstacts.AbilityService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.AbilityDao;
import kodlamaio.hrms.entities.concretes.Ability;

@Service
public class AbiltyManager implements AbilityService{

	private AbilityDao abilityDao;
	@Autowired
	public AbiltyManager(AbilityDao abilityDao) {
		super();
		this.abilityDao = abilityDao;
	}

	@Override
	public DataResult<List<Ability>> getAll() {
		 return new SuccesDataResult<List<Ability>>(abilityDao.findAll(),"yenetekler listelendi");
	}

	@Override
	public Result add(Ability ability) {
		abilityDao.save(ability);
        return new SuccesResult("Başarıyla eklendi");
	}

}
