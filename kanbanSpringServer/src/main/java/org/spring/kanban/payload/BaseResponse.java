package org.spring.kanban.payload;

import java.time.Instant;

import org.bson.types.ObjectId;

/**
 * @author Braian
 *
 */
public abstract class BaseResponse extends DateAuditResponse {
	private ObjectId id;
	private String name;

	public BaseResponse() {
		super();
	}

	public BaseResponse(ObjectId id, String name, String createdBy, Instant createdDate, String updatedBy,
			Instant updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
