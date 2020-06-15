package org.spring.kanban.payload;



import java.time.Instant;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.spring.kanban.domain.Attachment;

/**
 * @author Braian
 *
 */

public class CoverDetail extends DateAuditResponse {

	private ObjectId idAttachment;
	private String name;
	private Binary file;
	private String contentType;
	private ObjectId idCard;
	private ObjectId idBoard;

	public CoverDetail() {
		super();
	}

	public CoverDetail(ObjectId idAttachment, String name, String createdBy, Instant createdDate, String updatedBy,
			Instant updatedDate, Binary file, String contentType, ObjectId idCard, ObjectId idBoard) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.idAttachment = idAttachment;
		this.name = name;
		this.file = file;
		this.contentType = contentType;
		this.idCard = idCard;
		this.idBoard = idBoard;
	}

	public void setAttachment(Attachment attachment) {
		this.idAttachment = attachment.getId();
		this.name = attachment.getName();
		this.file = attachment.getFile();
		this.contentType = attachment.getContentType();
		this.idCard = attachment.getIdCard();
		this.idBoard = attachment.getIdBoard();
		setCreatedBy(attachment.getCreatedBy());
		setCreatedDate(attachment.getCreatedDate());
		setUpdatedBy(attachment.getUpdatedBy());
		setUpdatedDate(attachment.getUpdatedDate());
	}

	public ObjectId getIdAttachment() {
		return idAttachment;
	}

	public void setIdAttachment(ObjectId idAttachment) {
		this.idAttachment = idAttachment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
