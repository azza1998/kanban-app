package org.spring.kanban;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.spring.kanban.domain.KanbanBoard;
import org.spring.kanban.domain.KanbanCard;
import org.spring.kanban.domain.KanbanColumn;
import org.spring.kanban.repository.KanbanBoardRepository;
import org.spring.kanban.repository.KanbanCardRepository;
import org.spring.kanban.repository.KanbanColumnRepository;
import org.spring.kanban.service.KanbanBoardService;
import org.spring.kanban.service.KanbanCardService;
import org.spring.kanban.service.KanbanColumnService;
import org.spring.kanban.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KanbanSpringAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private KanbanColumnRepository kanbanColumnRepository;

	@Autowired
	private KanbanCardRepository kanbanCardRepository;

	@Autowired
	private KanbanBoardService kanbanBoarsService;
	
	@Autowired
	private KanbanCardService kanbanCardService;
	
	@Autowired
	private PositionService positionService;
	
	@Autowired
	private KanbanColumnService kanbanColumnService;
	
	@Autowired
	private KanbanBoardRepository kanbanBoardRepository;
	
	//@Test
	public void saveCards() {
		this.kanbanCardRepository.deleteAll();
		KanbanCard primeiro = new KanbanCard("primeiro",0l);
		KanbanCard segundo = new KanbanCard("segundo",1l);
		KanbanCard terceiro = new KanbanCard("terceiro",2l);
		KanbanCard quarto = new KanbanCard("quarto",3l);
		KanbanCard quinto = new KanbanCard("quinto",4l);
		List<KanbanCard> cards = new ArrayList<KanbanCard>();
		cards.add(primeiro);
		cards.add(segundo);
		cards.add(terceiro);
		cards.add(quarto);
		cards.add(quinto);
		this.kanbanCardRepository.saveAll(cards);
	}
	
	//@Test
	public void changePosition() {
		KanbanCard card = new KanbanCard();
		//this.kanbanCardService.changePosition(0L, 4l, card);
		System.out.println("Change position!!");
		//this.positionService.decreaseAllPositionsGreaterThanCurrentPositionAndDesiredPosition(0L, 4L, card);
	}
	
	//@Test
	public void createListColumns() {		
		this.kanbanColumnRepository.deleteAll();
		this.kanbanBoardRepository.deleteAll();
		
		KanbanBoard board = new KanbanBoard("Nova board");
		KanbanBoard boardSaved = this.kanbanBoardRepository.save(board);		
		
		KanbanColumn primeiro = new KanbanColumn("primeiro",boardSaved.getId(),0l);
		KanbanColumn segundo = new KanbanColumn("segundo",boardSaved.getId(),1l);
		KanbanColumn terceiro = new KanbanColumn("terceiro",boardSaved.getId(),2l);
		KanbanColumn quarto = new KanbanColumn("quarto",boardSaved.getId(),3l);
		KanbanColumn quinto = new KanbanColumn("quinto",boardSaved.getId(),4l);
		KanbanColumn sexto = new KanbanColumn("sexto",boardSaved.getId(),1l);
		sexto.setIdBoard(new ObjectId());
		
		List<KanbanColumn> columns = new ArrayList<KanbanColumn>();
		columns.add(primeiro);
		columns.add(segundo);
		columns.add(terceiro);
		columns.add(quarto);
		columns.add(quinto);	
		columns.add(sexto);
		this.kanbanColumnRepository.saveAll(columns);
		
		//this.positionService.incrementAllPositionsByOneGreaterThanDesiredPositionAndCurrentPosition(quarto.getPosition(), primeiro.getPosition(), board.getId(), quarto,"columns");
		//this.kanbanColumnService.moveColumnPosition(0l, 2L);
	}
	
	//@Test
	public void decreasePositions() {
		KanbanBoard boardExist =  this.kanbanBoardRepository.findById(new ObjectId("5ec193f38ac33714ffc9a6aa")).get();		
		this.kanbanColumnService.moveColumnPosition(3L, 0L, boardExist.getId());			
	}
	
	

}
