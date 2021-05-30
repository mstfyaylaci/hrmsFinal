package kodlamaio.hrms.core.utilities;

import org.springframework.context.annotation.Configuration;

import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.sendMail.MernisManager;

@Configuration
public class MernisAdapter implements MernisService{

	@Override
	public boolean auth(Candidate cantidate) {

		 MernisManager mernisManager = new MernisManager();

	        if (cantidate.getIdentification_number().length() == 11 && cantidate.getFirstName().equals("mustafa")) {
	            mernisManager.mernis(cantidate.getFirstName());
	            return true;
	        } else
	            return false;
	    }
		 
	}


