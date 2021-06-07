package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")
@AllArgsConstructor
@NoArgsConstructor


public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	//@Column(name="employer_id")
	//private int employerId;
	
	//@Column(name="job_position_id")
	//private int jobPositonId;
	
	
	@NotBlank
	@NotNull
	@Column(name="description",length = 2500)
	@Type(type="text")
	private String description;
	
	@NotBlank
	@NotNull
	@Column(name="min_salary")
	private double minSalary;
	
	@NotBlank
	@NotNull
	@Column(name="max_salary")
	private double maxSalary;
	
	@NotBlank
	@NotNull
	@Column(name="quota")
	private int quota;
	
	@NotBlank
	@NotNull
	@Column(name="application_deadline")
	private Date  applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive=true;
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name="job_title_id")
	private JobTitle jobTitle;
}
