package org.spring.kanban.payload;

import java.time.Instant;

import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 * @author Braian
 *
 */
public class AttachmentDetails extends BaseResponse {

	private Binary file;
	private String contentType;
	private ObjectId idCard;
	private ObjectId idBoard;

	public AttachmentDetails() {
		super();
	}

	public AttachmentDetails(ObjectId id, String name, String createdBy, Instant createdDate, String updatedBy,
			Instant updatedDate, Binary file, String contentType, ObjectId idCard, ObjectId idBoard) {
		super(id, name, createdBy, createdDate, updatedBy, updatedDate);
		this.contentType = contentType;
		this.file = file;
		this.idCard = idCard;
		this.idBoard = idBoard;
	}

	public Binary getFile() {
		return file;
	}

	public void setFile(Binary file) {
		this.file = file;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public ObjectId getIdCard() {
		return idCard;
	}

	public void setIdCard(ObjectId idCard) {
		this.idCard = idCard;
	}

	public ObjectId getIdBoard() {
		return idBoard;
	}

	public void setIdBoard(ObjectId idBoard) {
		this.idBoard = idBoard;
	}

}
