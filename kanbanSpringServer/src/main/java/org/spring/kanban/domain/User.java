package org.spring.kanban.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Braian
 *
 */
@Document(collection = "users")
public class User extends DateAudit<String> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	
	@NotBlank
	@Size(max=40)
	private String name;
	
	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 20)
	private String password;	
	
	@NotBlank
	@Email
	@Size(max=40)
	private String email;
	
	@Null
	private Binary profilePicture;

	Set<Role> roles = new HashSet<Role>();

	public User(ObjectId id, String name, String lastName, String username, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public User(String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public User(ObjectId id, String name, String username, String password, String email, Binary profilePicture,
			Set<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.profilePicture = profilePicture;
		this.roles = roles;
	}

	public User() {

	}

	public User(String username, String password, String email, Set<Role> roles) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.roles = roles;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Binary getProfilePicturer() {
		return profilePicture;
	}

	public void setProfilePicture(Binary profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", email="
				+ email + ", profilePicture=" + profilePicture + ", roles=" + roles + "]";
	}

}
