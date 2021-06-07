package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.LinkType;


public interface LinkTypeService {

DataResult<List<LinkType>> getAll();
	
	Result add(LinkType linkType);
}
