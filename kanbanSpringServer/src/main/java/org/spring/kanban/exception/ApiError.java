package org.spring.kanban.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

/**
 * @author Braian
 *
 */
public class ApiError {

	private HttpStatus httpStatus;

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;
	private String message;

	public ApiError(HttpStatus httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.timestamp = LocalDateTime.now();
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

}
