package org.spring.kanban.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Braian
 *
 */
@Document(collection = "boards")
public class KanbanBoard extends BaseEntity<ObjectId> {

	private static final long serialVersionUID = 1L;

	public KanbanBoard() {
		super();
	}

	public KanbanBoard(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "KanbanBoard [getId()=" + getId() + ", getName()=" + getName() + "]";
	}

}
