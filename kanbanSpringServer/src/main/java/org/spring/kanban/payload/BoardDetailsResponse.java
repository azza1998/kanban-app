package org.spring.kanban.payload;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Braian
 *
 */
@Getter @Setter
@NoArgsConstructor
public class BoardDetailsResponse extends BaseResponse {

	List<ColumnDetails> columns = new ArrayList<ColumnDetails>();

	public BoardDetailsResponse(ObjectId id, String name, String createdBy, Instant createdDate, String updatedBy,
			Instant updatedDate, List<ColumnDetails> columns) {
		super(id, name, createdBy, createdDate, updatedBy, updatedDate);
		this.columns = columns;
	}

}
