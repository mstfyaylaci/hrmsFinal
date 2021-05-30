package kodlamaio.hrms.core.utilities;

import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.sendMail.MailManager;

public class MailAdapter implements MailService{

	@Override
	public void email(Candidate candidate) {

		 MailManager email = new MailManager();
	        email.mesaj(candidate.getFirstName());
	}

	
}
