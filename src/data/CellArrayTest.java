package data;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CellArrayTest {

	private static CellArray cells1 = new CellArray(30,30);
	private static CellArray cells2 = new CellArray(30,30);
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testCellArray() {
		assertEquals(30,cells1.getRow());
		assertEquals(30,cells1.getCol());
	}

	@Test
	public void testGetCell() {
		assertEquals(0,cells1.getCell(20, 2));
		assertEquals(-1,cells1.getCell(30, 2));
	}

	@Test
	public void testSetCell() {
		for(int i=0;i<cells1.getRow();i++) {
			for(int j=0;j<cells1.getCol();j++) {
				cells1.setCell(i, j, 0);
			}
		}	
		for(int i=0;i<cells2.getRow();i++) {
			for(int j=0;j<cells2.getCol();j++) {
				cells2.setCell(i, j, 1);
			}
		}	
		for(int i=0;i<cells1.getRow();i++) {
			for(int j=0;j<cells1.getCol();j++) {
				assertEquals(0,cells1.getCell(i, j));
			}
		}	
		for(int i=0;i<cells2.getRow();i++) {
			for(int j=0;j<cells2.getCol();j++) {
				assertEquals(1,cells2.getCell(i, j));
			}
		}	
	}

}



