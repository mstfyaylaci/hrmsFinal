package kodlamaio.hrms.dataAccess.abstacts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SchoolCandidate;

public interface SchoolCandidateDao extends JpaRepository<SchoolCandidate, Integer> {

	List<SchoolCandidate> getByCandidate_Id(int candidateId);

}
