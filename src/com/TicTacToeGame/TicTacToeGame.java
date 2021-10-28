package com.TicTacToeGame;

import java.util.Scanner;

public class TicTacToeGame 
{
	char board[] = new char[10];
	char player;
	char computer;
	char choice;
	public void newBoard()
	{
		for(int i=1; i<board.length; i++)
		{
			board[i]=' ';
		}
	}
	public void choose()
	{
		Scanner sc=new Scanner(System.in);
		choice = sc.next().charAt(0);
		if (choice=='x')
		{
			player='x';
			computer='o';
		}
		else
		{
			player='o';
			computer='x';
		}
	}
	public static void main(String[] args)
	{
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.newBoard();
		obj1.choose();
	}
}
