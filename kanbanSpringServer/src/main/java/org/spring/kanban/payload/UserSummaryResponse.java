package org.spring.kanban.payload;

import java.util.Set;

import org.bson.types.ObjectId;
import org.spring.kanban.domain.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Braian
 *
 */
@Getter @Setter
@AllArgsConstructor
public class UserSummaryResponse {

	private ObjectId id;
	private String username;
	private String name;
}
