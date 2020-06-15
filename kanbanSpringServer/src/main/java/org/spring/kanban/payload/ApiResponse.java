package org.spring.kanban.payload;

/**
 * @author Braian
 *
 */
public abstract class ApiResponse {
	private Boolean success;
	private String message;

	public ApiResponse(Boolean success) {
		this.success = success;
	}

	public void addMessage(String message) {
		this.setMessage(message);
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
