package kodlamaio.hrms.dataAccess.abstacts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> { 
	// bu kısımda veri tabanını jobposition ile bağladık ve integer olduğunu belli ettik
	// JpaRepository CRUD işlemlerini bizim için kendi yapar 
	// CRUD =Crate,Read,Update,Delete
	List<JobTitle> findById(String id);

}
