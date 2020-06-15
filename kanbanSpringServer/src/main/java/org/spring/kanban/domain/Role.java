package org.spring.kanban.domain;

/**
 * @author Braian
 *
 */
public class Role {

	private RoleName name;

	public Role(RoleName name) {
		this.name = name;
	}

	public Role() {
	}

	public RoleName getRoleName() {
		return name;
	}

	public void setRoleName(RoleName name) {
		this.name = name;
	}

}
