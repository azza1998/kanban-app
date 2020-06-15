package org.spring.kanban.domain;

import org.bson.types.Binary;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Braian
 *
 */
@Document(value = "attachments")
public class Attachment extends BaseEntity<ObjectId> {

	private static final long serialVersionUID = 1L;
	private Binary file;
	private String contentType;
	private ObjectId idCard;
	private ObjectId idBoard;

	public Attachment() {
	}

	public Attachment(String name, Binary file, String contentType, ObjectId idCard, ObjectId idBoard) {
		super(name);
		this.file = file;
		this.contentType = contentType;
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

	@Override
	public String toString() {
		return "Attachment [file=" + file + ", contentType=" + contentType + ", idCard=" + idCard + ", idBoard="
				+ idBoard + "]";
	}

}
