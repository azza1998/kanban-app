package org.spring.kanban.payload;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

/**
 * @author Braian
 *
 */
public class ColumnDetails extends BaseResponse {

	private ObjectId idBoard;

	private Long position;

	List<CardDetails> cards = new ArrayList<CardDetails>();

	public ColumnDetails() {
		super();
	}

	public ColumnDetails(ObjectId id, String name, String createdBy, Instant createdDate, String updatedBy,
			Instant updatedDate, ObjectId idBoard, Long position, List<CardDetails> cards) {
		super(id, name, createdBy, createdDate, updatedBy, updatedDate);
		this.position = position;
		this.idBoard = idBoard;
		this.cards = cards;
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

	public List<CardDetails> getCards() {
		return cards;
	}

	public void setCards(List<CardDetails> cards) {
		this.cards = cards;
	}

}
