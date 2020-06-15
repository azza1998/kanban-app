package org.spring.kanban.payload;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

/**
 * @author Braian
 *
 */
public class CardWithAttachmentsResponse extends BaseResponse {

	private String description;
	private ObjectId idColumn;
	private CoverDetail cover;
	private List<AttachmentDetails> attachments = new ArrayList<AttachmentDetails>();

	public CardWithAttachmentsResponse() {
		super();
	}

	public CardWithAttachmentsResponse(ObjectId id, String name, String description, String createdBy,
			Instant createdDate, String updatedBy, Instant updatedDate, ObjectId idColumn, CoverDetail cover,
			List<AttachmentDetails> attachments) {
		super(id, name, createdBy, createdDate, updatedBy, updatedDate);
		this.description = description;
		this.idColumn = idColumn;
		this.cover = cover;
		this.attachments = attachments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ObjectId getIdColumn() {
		return idColumn;
	}

	public void setIdColumn(ObjectId idColumn) {
		this.idColumn = idColumn;
	}

	public CoverDetail getCover() {
		return cover;
	}

	public void setCovers(CoverDetail cover) {
		this.cover = cover;
	}

	public List<AttachmentDetails> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<AttachmentDetails> attachments) {
		this.attachments = attachments;
	}

}
