package org.spring.kanban.payload;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
public class PasswordRequest {

	@NotBlank
	@Size(min = 6, max = 20)
	private String oldPassword;
	@NotBlank
	@Size(min = 6, max = 20)
	private String newPassword;
}
