package kodlamaio.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")

public class Employee extends User{

	@NotBlank
	@NotNull
	@Column(name = "first_name")
    private String firstName;

	@NotBlank
	@NotNull
    @Column(name = "last_name")
    private String lastName;
}
