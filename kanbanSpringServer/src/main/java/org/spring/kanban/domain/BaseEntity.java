package org.spring.kanban.domain;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

/**
 * @author Braian
 *
 */
public abstract class BaseEntity<U> extends DateAudit<String> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private U id;

	@NotBlank
	private String name;

	public U getId() {
		return id;
	}

	public void setId(U id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BaseEntity(String name) {
		super();
		this.name = name;
	}

	public BaseEntity() {
		super();
	}

}
