package org.spring.kanban.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Braian
 *
 */
@Document(collection = "columns")
public class KanbanColumn extends BaseEntity<ObjectId> {

	private static final long serialVersionUID = 1L;

	private ObjectId idBoard;
	private Long position;

	public KanbanColumn() {
		super();
	}

	public KanbanColumn(String nome, Long position) {
		super(nome);
		this.position = position;
	}
	
	public KanbanColumn(String name, ObjectId idBoard, Long position) {
		super(name);
		this.idBoard = idBoard;
		this.position = position;
	}

	public ObjectId getIdBoard() {
		return idBoard;
	}

	public void setIdBoard(ObjectId idBoard) {
		this.idBoard = idBoard;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "KanbanColumn [idBoard=" + idBoard + ", position=" + position + "]";
	}

	

}
