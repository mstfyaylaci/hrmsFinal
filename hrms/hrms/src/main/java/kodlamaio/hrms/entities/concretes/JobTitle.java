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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //  sen bir veri tabanı tablosusun .JobTitle bir veri tabanı tablosunun karşılığıdır
@Data   //  lombok bizim yerimize getters and settersleri getirdi

@Table(name="job_titles") // veri tabanında job_positions ile eşleştirdik
@AllArgsConstructor
@NoArgsConstructor

public class JobTitle {
	
	@Id // JobPositions'un primary keyi id'dir(veri tabanındaki id yi belirttik)
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) // bir bir artmasını sağlayacak
	
	@Column(name="id")// burada sen veri tabanında kolonsun ve buna eşitsin dedik
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="title")// burada sen veri tabanında kolonsun ve buna eşitsin dedik
	private String title;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobTitle")
	private List<WorkplaceCandidate>  WorkplaceCandidates ;
	

}
