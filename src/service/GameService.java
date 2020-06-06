package service;
import java.util.Random;

import data.CellArray;
public class GameService {
//	private static int rows;
//	private static int cols;
	
	
	/*³õÊ¼»¯Ëæ»ú*/
	public static CellArray initMap(int row,int col ) {
		CellArray cells=new CellArray(row,col);
		for(int  i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Random r=new Random();
				int a=r.nextInt(4);
				if(a==1) {
					cells.setCell(i,j,1);//CellState.LIVE.getValue()
				}
				else {
					cells.setCell(i,j,0);//CellState.DEAD.getValue()
					
				}
			}
		}
		return cells;
	}
	
	public static CellArray generate(CellArray cells1) {
		CellArray nextCells=new CellArray(cells1.getRow(),cells1.getCol());
	  for(int i=0;i<nextCells.getRow();i++) 
		  for(int j=0;j<nextCells.getCol();j++) {
			  
			int count=countNumber(cells1,i,j);
			 if(count==3) {
				 nextCells.setCell(i, j, 1);//CellState.LIVE.getValue()
			 }
			 else if(count==2&&cells1.getCell(i, j)==1) {//CellState.LIVE.getValue()
				 nextCells.setCell(i, j, 1);//CellState.LIVE.getValue()
			 }
			 else {
				 nextCells.setCell(i, j,0);// CellState.DEAD.getValue()
			 }
		  }
	  
		
		return  nextCells;
		
	}
	
	public static int[] temp= {-1,0,1};
	public static int countNumber(CellArray cells,int x,int y) {
		int count = 0;
		 for (int i = 0; i < 3; ++i) {
	            for (int j = 0; j < 3; ++j) {
	                if (1 == cells.getCell(x + temp[i], y + temp[j])) {//CellState.LIVE.getValue() 
	                    ++count;
	                }
	            }
	        }	
		 if (1 == cells.getCell(x, y)) {//CellState.LIVE.getValue()
	            --count;
	        }
		
        return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
