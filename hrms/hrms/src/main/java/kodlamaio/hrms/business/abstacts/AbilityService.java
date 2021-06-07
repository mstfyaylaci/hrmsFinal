package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Ability;

public interface AbilityService {

	 DataResult<List<Ability>> getAll();

	    Result add(Ability ability);
}
