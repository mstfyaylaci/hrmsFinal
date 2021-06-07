package kodlamaio.hrms.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class AppConfiguration {
	@Bean
	
	  public Cloudinary cloudinaryService(){
        return new Cloudinary(
                ObjectUtils.asMap(
                        "cloud_name","mustafayaylaci",
                        "api_key", "121717679137357",
                        "api_secret","Nyx5ZEgPtjdSws1iSpwMnMEBA4c"
                )
        );
    }
}
