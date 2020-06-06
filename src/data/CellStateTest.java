package data;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CellStateTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCellState() {
		CellState cellstate1 = CellState.DEAD;
		CellState cellstate2 = CellState.LIVE;
		assertEquals(0, cellstate1.getValue());
		assertEquals(1, cellstate2.getValue());
	}

}
