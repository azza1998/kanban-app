package org.spring.kanban.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Braian
 *
 */
public class PasswordRequest {

	@NotBlank
	@Size(min = 6, max = 20)
	private String oldPassword;
	@NotBlank
	@Size(min = 6, max = 20)
	private String newPassword;

	public PasswordRequest() {
		super();
	}

	public PasswordRequest(String oldPassword, String newPassword) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
