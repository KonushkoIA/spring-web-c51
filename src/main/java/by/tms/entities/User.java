package by.tms.entities;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotBlank(message = "svoe ssobchenie")
	@NotEmpty
	private String name;
	@NotBlank // " " true
	@NotEmpty //"    " false
	//  @Pattern()
//	@Max(45)
//	@Range(min = 3, max = 15)
//	@Size()
//	@Email(regexp = "")
	private String password;

	public User(String name, String password) {
		this.name = name;
		this.password = password;
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
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}