package iesjacaranda.eedd.snakegametests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iesjacaranda.eedd.snakegame.Board;
import iesjacaranda.eedd.snakegame.Cell;
import iesjacaranda.eedd.snakegame.Game;
import iesjacaranda.eedd.snakegame.Snake;

class GameTest {

	@Test
	public void testGetNextCellRight() {
		Cell aux2 = new Cell(0, 0);
		Snake aux = new Snake(aux2);
		Board aux3 = new Board(5, 5);
		Game target = new Game(aux, aux3);
		target.setDirection(1);
		
	}

}
