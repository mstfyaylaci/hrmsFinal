package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="language_candidates")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class LanguageCandidate {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="language_id")
	private Language language;
	
	@ManyToOne
	@JoinColumn(name="language_level_id")
	private LanguageLevel languageLevel;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
}
