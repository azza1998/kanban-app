package org.spring.kanban.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Braian
 *
 */
public class EmailRequest {

	@NotBlank
	@Size(min = 6, max = 20)
	private String currentPassword;

	@NotBlank
	@Email
	@Size(max = 40)
	private String email;

	public EmailRequest() {
		super();
	}

	public EmailRequest(String currentPassword, @Email String email) {
		super();
		this.currentPassword = currentPassword;
		this.email = email;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
