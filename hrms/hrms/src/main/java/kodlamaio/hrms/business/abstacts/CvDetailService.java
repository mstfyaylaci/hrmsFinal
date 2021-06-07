package kodlamaio.hrms.business.abstacts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.CvDetail;

public interface CvDetailService {

	  DataResult<List<CvDetail>> getAll();

	    DataResult<CvDetail> getByCandidateId(int candidateId);

	    Result add(CvDetail cvDetail);

	    Result uploadPhoto(MultipartFile file,int candidateId);

}
