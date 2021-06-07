package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstacts.CvDetailService;
import kodlamaio.hrms.core.helpers.imageHelpers.ImageUpload;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstacts.CvDetailDao;
import kodlamaio.hrms.entities.concretes.CvDetail;

@Service
public class CvDetailManager implements CvDetailService{

	 private CvDetailDao cvDetailDao;
	 private ImageUpload imageUpload;
	public CvDetailManager(CvDetailDao cvDetailDao, ImageUpload imageUpload) {
		super();
		this.cvDetailDao = cvDetailDao;
		this.imageUpload = imageUpload;
	}

	@Override
	public DataResult<List<CvDetail>> getAll() {
		return new SuccesDataResult<List<CvDetail>>(cvDetailDao.findAll());
	}

	@Override
	public DataResult<CvDetail> getByCandidateId(int candidateId) {
		return new SuccesDataResult<CvDetail>(cvDetailDao.getByCandidate_Id(candidateId));
	}

	@Override
	public Result add(CvDetail cvDetail) {
		  cvDetailDao.save(cvDetail);
	        return new SuccesResult("başarıyla eklendi");
	}

	@Override
	public Result uploadPhoto(MultipartFile file, int candidateId) {
		CvDetail cvDetail = getByCandidateId(candidateId).getData();
		 Map<String,String> result =(Map<String, String>) imageUpload.upload(file).getData();
		 
		 String url = result.get("url");
	        cvDetail.setCvPhotoUrl(url);
	        cvDetailDao.save(cvDetail);
	        return new SuccesResult("başarılı");
	}

}
