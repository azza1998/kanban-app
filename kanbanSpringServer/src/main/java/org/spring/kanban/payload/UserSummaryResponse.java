package org.spring.kanban.payload;

import org.bson.types.ObjectId;

/**
 * @author Braian
 *
 */
public class UserSummaryResponse {

	private ObjectId id;
	private String username;
	private String name;

	public UserSummaryResponse() {
		super();
	}

	public UserSummaryResponse(ObjectId id, String username, String name) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
