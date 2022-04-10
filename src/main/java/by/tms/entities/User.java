package by.tms.entities;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User {

	private long id;

	@NotBlank(message = "svoe ssobchenie")
	@NotEmpty
	private String name;
	@NotBlank // " " true
	@NotEmpty //"    " false
	//  @Pattern()
//	@Max(45)
	@Range(min = 3, max = 50)
//	@Size()
//	@Email(regexp = "")
	private String password;

	public User(Long id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
