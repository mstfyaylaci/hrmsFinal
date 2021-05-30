package kodlamaio.hrms.dataAccess.abstacts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.Candidate;
@Repository
public interface CandidateDao extends JpaRepository<Candidate, Integer> {

	
	List<Candidate> findByEmail(String email);
}
