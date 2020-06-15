package org.spring.kanban.payload;

import java.time.Instant;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.spring.kanban.domain.User;

/**
 * @author Braian
 *
 */
public class UserProfileResponse {

	private ObjectId id;
	private String name;
	private String username;
	private String email;
	private Binary profilePicture;
	
	private Instant joinedAt;

	public UserProfileResponse() {
		super();
	}

	public UserProfileResponse(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.username = user.getUsername();
		this.email = user.getEmail();
		this.profilePicture = user.getProfilePicturer();
		this.joinedAt = user.getCreatedDate();
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

	public Binary getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(Binary profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Instant getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(Instant joinedAt) {
		this.joinedAt = joinedAt;
	}

}
