package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
@EqualsAndHashCode(callSuper = false) 
@PrimaryKeyJoinColumn(name="id")
public class Candidate extends User{
	

	@NotBlank
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank
	@NotNull
	@Column(name="identity_number")
	private String identification_number;
	
	@NotBlank
	@NotNull
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<SchoolCandidate> schoolcandidates;

	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<WorkplaceCandidate> workplaceCandidates;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<LanguageCandidate>  languageCandidates ;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<SocialMedia>  SocialMedias ;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidate")
	private CvDetail  cvDetails ;

}
