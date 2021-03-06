package com.chessmaster;
public class Pawn {
	
	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col; 
	
	public Pawn(String color, int row, int col) {
		
		this.color = color;
		this.power = 1;
		this.id    = 1;
		
		this.row = row;
		this.col = col;
		
	}
	
		public boolean isMoveActionValid(int moveRow, int moveCol) {
			
			int moveRowCoeficient = this.row - moveRow;
			int moveColCoeficient = this.col - moveCol;
			
			boolean isMoveActionValidRegardingRow = (moveRowCoeficient == 1);
			boolean isMoveActionValidRegardingCol = (moveColCoeficient == 1);
			
			
			
			return isMoveActionValidRegardingRow &&
					 isMoveActionValidRegardingCol;
					
		}//boolean isMoveActionValidRegardingRow = (moveRowCoeficient == 1);
		public void move(int row, int col) {
		if(isMoveActionValid (row, col)) {
			
			this.row = row;
			this.col = col;
		}
	}
		
		
		
		public void attack() {
		
	}
		public void render() {
	
	}
}
