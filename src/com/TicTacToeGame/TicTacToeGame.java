package com.TicTacToeGame;

public class TicTacToeGame 
{
	char board[] = new char[10];
	public void newBoard()
	{
		for(int i=1; i<board.length; i++)
		{
			board[i]=' ';
		}
	}
	public static void main(String[] args)
	{
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.newBoard();
	}
}
