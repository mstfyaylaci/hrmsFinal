package kodlamaio.hrms.dataAccess.abstacts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SchoolDepartment;

public interface SchoolDepartmentDao extends JpaRepository<SchoolDepartment, Integer> {

}
