package com.chestmaster.test;
import com.chessmaster.*;
import com.chestmaster.config.*;

public class PawnTest {

	public static void testIfPieceCanMoveOnlyOneSquare() {
		
		System.out.print("testIfPieceCanMoveOnlyOneSquare -");
		// AAA
		// 3 steps: 1. Arrange
		Pawn testElement = new Pawn(PieceColor.BLACK, 8, 0);
		
		//2. Act
		boolean isValid = testElement.isMoveActionValid(7, 0);
		
		//3. Assert
		
		String testMessage = (isValid) ? "Valid" : "Failed";
		System.out.print(testMessage);
	}
	
	public static void testIfPieceCannotMoveMorThanOneSquare() {
		System.out.print("testIfPieceCannotMoveMorThanOneSquare -");
		// AAA
			// 3 steps: 1. Arrange
			Pawn testElement = new Pawn(PieceColor.BLACK, 8, 0);
				
			//2. Act
			boolean isValid = (testElement.isMoveActionValid(6, 0) == false);
				
			//3. Assert
				
			String testMessage = (isValid) ? "Valid" : "Failed";
			System.out.print(testMessage);
		}
	
	public static void run() {
		
		
		testIfPieceCanMoveOnlyOneSquare();
		testIfPieceCannotMoveMorThanOneSquare();
	}
	
	
}
