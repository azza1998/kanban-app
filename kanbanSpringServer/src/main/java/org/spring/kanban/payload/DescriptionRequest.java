package org.spring.kanban.payload;

import javax.validation.constraints.Size;

public class DescriptionRequest {	
	
	@Size(max = 2000)
	private String Description;

	public DescriptionRequest() {
	}

	public DescriptionRequest(String Description) {
		this.Description = Description;
	}

	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

}