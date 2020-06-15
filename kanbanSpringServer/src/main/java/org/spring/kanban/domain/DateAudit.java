package org.spring.kanban.domain;

import java.time.Instant;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Braian
 *
 */
@JsonIgnoreProperties(
		value = { "createdBy", "createdDate",
				"updatedBy", "updatedDate" },
		allowGetters = true)
public abstract class DateAudit<U> {

	@CreatedBy
	private U createdBy;

	@CreatedDate
	private Instant createdDate;

	@LastModifiedBy
	private U updatedBy;

	@LastModifiedDate
	private Instant updatedDate;

	public U getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(U createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public U getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(U updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}
}
