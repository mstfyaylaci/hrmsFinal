package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="schools")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","schoolDepartments"})
public class School {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="school_name")
	private String schoolName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "school")
	private List<SchoolDepartment>  schoolDepartments ;
}
