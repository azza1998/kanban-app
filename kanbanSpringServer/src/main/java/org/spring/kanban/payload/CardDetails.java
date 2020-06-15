package org.spring.kanban.payload;

import java.time.Instant;

import org.bson.types.ObjectId;

/**
 * @author Braian
 *
 */
public class CardDetails extends BaseResponse {

	private ObjectId idColumn;
	private ObjectId idBoard;
	private Long position;
	private AttachmentDetails cover;
	private Integer fileSize;

	public CardDetails() {
		super();
	}

	public CardDetails(ObjectId id, String name, String createdBy, Instant createdDate, String updatedBy,
			Instant updatedDate, ObjectId idColumn, ObjectId idBoard, Long position, AttachmentDetails cover,
			Integer fileSize) {
		super(id, name, createdBy, createdDate, updatedBy, updatedDate);
		this.idColumn = idColumn;
		this.idBoard = idBoard;
		this.position = position;
		this.cover = cover;
		this.fileSize = fileSize;
	}

	public ObjectId getIdColumn() {
		return idColumn;
	}

	public void setIdColumn(ObjectId idColumn) {
		this.idColumn = idColumn;
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

	public AttachmentDetails getCover() {
		return cover;
	}

	public void setCover(AttachmentDetails cover) {
		this.cover = cover;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

}
