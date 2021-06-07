package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstacts.LinkTypeService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.LinkTypeDao;
import kodlamaio.hrms.entities.concretes.LinkType;


public class LinkTypeManager implements LinkTypeService{

	private LinkTypeDao linkTypeDao;
	@Autowired
	public LinkTypeManager(LinkTypeDao linkTypeDao) {
		
		this.linkTypeDao = linkTypeDao;
	}

	@Override
	public DataResult<List<LinkType>> getAll() {
		return new SuccesDataResult<List<LinkType>>(this.linkTypeDao.findAll());
	}

	@Override
	public Result add(LinkType linkType) {
		this.linkTypeDao.save(linkType);
		return new SuccesResult("link eklendi");
	}

}
