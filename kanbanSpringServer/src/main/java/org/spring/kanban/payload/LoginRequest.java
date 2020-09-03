package org.spring.kanban.payload;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Braian
 *
 */
@Getter @Setter
@AllArgsConstructor
public class LoginRequest {
	
	@NotBlank
	private String username;

	@NotBlank	
	private String password;
}
