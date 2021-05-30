package kodlamaio.hrms.dataAccess.abstacts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee , Integer>{

	 List<Employee> findAllByEmail (String email);
}
