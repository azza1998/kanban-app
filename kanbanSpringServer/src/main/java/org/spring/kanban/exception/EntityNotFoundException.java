package org.spring.kanban.exception;

/**
 * @author Braian
 *
 */
public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String entityName;
	private String fieldName;
	private Object fieldValue;

	public EntityNotFoundException(String entityName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : %s", entityName, fieldName, fieldValue));
		this.entityName = entityName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getEntityName() {
		return entityName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

}
