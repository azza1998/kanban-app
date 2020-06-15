package org.spring.kanban.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Braian
 *
 */
public class NameRequest {

	@NotBlank
	@Size(max = 40)
	private String name;

	public NameRequest() {
	}

	public NameRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
