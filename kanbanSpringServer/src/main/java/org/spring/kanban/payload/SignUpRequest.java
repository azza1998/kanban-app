package org.spring.kanban.payload;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.spring.kanban.domain.Role;

/**
 * @author Braian
 *
 */
public class SignUpRequest {

	@NotBlank
	@Size(max = 40)
	private String name;

	@Pattern(regexp = "^[a-zA-Z0-9_-]*$", message = "Letters, numbers, dashes, and underscores only.")
	@NotBlank
	@Size(min = 4, max = 20)
	private String username;

	@NotBlank
	@Size(max = 40)
	@Email
	private String email;

	@NotBlank
	@Size(min = 6, max = 20)
	private String password;

	private Set<Role> roles = new HashSet<Role>();

	public SignUpRequest(String name, String username, String email, String password, Set<Role> roles) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public SignUpRequest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
