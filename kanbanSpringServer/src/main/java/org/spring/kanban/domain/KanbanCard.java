package org.spring.kanban.domain;

import org.bson.types.ObjectId;
import org.spring.kanban.payload.CoverDetail;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Braian
 *
 */
@Document(collection = "cards")
public class KanbanCard extends BaseEntity<ObjectId> {

	private static final long serialVersionUID = 1L;

	private ObjectId idColumn;

	private String description;

	private CoverDetail cover;

	private ObjectId idBoard;

	private Long position;

	public KanbanCard() {
		super();
	}

	public KanbanCard(String name, ObjectId idColumn, String description, CoverDetail cover, ObjectId idBoard,
			Long position) {
		super(name);
		this.idColumn = idColumn;
		this.description = description;
		this.cover = cover;
		this.idBoard = idBoard;
		this.position = position;
	}
	
	


	public KanbanCard(String name, Long position) {
		super(name);
		this.position = position;
	}

	public ObjectId getIdColumn() {
		return idColumn;
	}

	public void setIdColumn(ObjectId idColumn) {
		this.idColumn = idColumn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CoverDetail getCover() {
		return cover;
	}

	public void setCover(CoverDetail cover) {
		this.cover = cover;
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
		return "KanbanCard [idColumn=" + idColumn + ", description=" + description + ", cover=" + cover + ", idBoard="
				+ idBoard + ", position=" + position + "]";
	}

}
