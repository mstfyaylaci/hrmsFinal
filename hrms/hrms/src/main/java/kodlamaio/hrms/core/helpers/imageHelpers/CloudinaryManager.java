package kodlamaio.hrms.core.helpers.imageHelpers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;

@Service
public class CloudinaryManager implements ImageUpload{

	@Autowired
	public CloudinaryManager(Cloudinary cloudinary) {
		
		this.cloudinary = cloudinary;
	}
	private Cloudinary cloudinary;
	@Override
	public DataResult<Map> upload(MultipartFile multiPartfile) {
		 Map uploadResult = null;

	        try {
	            File file = convert(multiPartfile);
	            uploadResult = this.cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	            file.delete();
	        }catch (Exception e){
	            e.printStackTrace();
	        }

	        return new SuccesDataResult<Map>(uploadResult);
	}
	
	 private File convert(MultipartFile multipartFile) throws IOException {
	        File file = new File(multipartFile.getOriginalFilename());
	        FileOutputStream stream = new FileOutputStream(file);
	        stream.write(multipartFile.getBytes());
	        stream.close();

	        return file;
	    }

}
