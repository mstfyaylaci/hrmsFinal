package kodlamaio.hrms.dataAccess.abstacts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Ability;

public interface AbilityDao extends JpaRepository<Ability, Integer>{

}
