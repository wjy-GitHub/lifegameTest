package service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import data.CellArray;


public class GameServiceTest {
	
	
	 CellArray cells1 = new CellArray(30,30);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGenerate() {
		for(int i=0;i<cells1.getRow();i++) {
			for(int j=0;j<cells1.getCol();j++) {
				cells1.setCell(i, j, 0);
			}
		}
		cells1.setCell(0, 0, 0);
		cells1.setCell(0, 1, 1);
		cells1.setCell(1, 0, 1);
		cells1.setCell(1, 1, 1);
 		
		for(int i=0;i<cells1.getRow();i++) {
			for(int j=0;j<cells1.getCol();j++) {
				cells1.setCell(i, j, 0);
			}
		}
		cells1.setCell(0, 0, 1);
		cells1.setCell(0, 1, 0);
		cells1.setCell(1, 0, 1);
		cells1.setCell(1, 1, 1);
		assertEquals(1,GameService.generate(cells1).getCell(0, 0));
		
		for(int i=0;i<cells1.getRow();i++) {
			for(int j=0;j<cells1.getCol();j++) {
				cells1.setCell(i, j, 0);
			}
		}
		cells1.setCell(0, 0, 0);
		cells1.setCell(0, 1, 0);
		cells1.setCell(1, 0, 1);
		cells1.setCell(1, 1, 1);
		assertEquals(0,GameService.generate(cells1).getCell(0, 0));
		
		
	}

	@Test
	public void testCountNumber() {
		
		for(int i=0;i<cells1.getRow();i++) {
			for(int j=0;j<cells1.getCol();j++) {
				cells1.setCell(i, j, 0);
			}
		}
		cells1.setCell(0, 0, 1);
		cells1.setCell(0, 1, 1);
		cells1.setCell(1, 0, 1);
		cells1.setCell(1, 1, 1);
		assertEquals(3,GameService.countNumber(cells1, 0, 0));
	}

}
