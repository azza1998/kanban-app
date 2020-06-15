package org.spring.kanban.payload;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

/**
 * @author Braian
 *
 */
public class BoardDetailsResponse extends BaseResponse {

	List<ColumnDetails> columns = new ArrayList<ColumnDetails>();

	public BoardDetailsResponse() {
	}

	public BoardDetailsResponse(ObjectId id, String name, String createdBy, Instant createdDate, String updatedBy,
			Instant updatedDate, List<ColumnDetails> columns) {
		super(id, name, createdBy, createdDate, updatedBy, updatedDate);
		this.columns = columns;
	}

	public List<ColumnDetails> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnDetails> columns) {
		this.columns = columns;
	}

}
