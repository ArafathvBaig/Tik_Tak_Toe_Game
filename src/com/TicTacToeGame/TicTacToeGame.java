package com.TicTacToeGame;

import java.util.Scanner;

public class TicTacToeGame 
{
	char[] board = new char[10];
	char player;
	char computer;
	char choice;
	int location;
	int flag=0;
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
	public void showBoard()
	{
		System.out.println(board[1]+" |"+board[2]+" |"+board[3]);
		System.out.println("--------");
		System.out.println(board[4]+" |"+board[5]+" |"+board[6]);
		System.out.println("--------");
		System.out.println(board[7]+" |"+board[8]+" |"+board[9]);
	}
	public void location()
	{
		Scanner sc=new Scanner(System.in);
		location=sc.nextInt();
		if((location>=1) && (location<=9))
		{
			if(board[location]==' ')
			{
				flag=0;
			}
			else
			{
				flag=1;
			}
		}
	}
	public void playerMove_1()
	{
		location();
		if(flag==0)
		{
			board[location]=player;
		}
		else
		{
			board[location]=' ';
		}
		showBoard();
	}
	public static void main(String[] args)
	{
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.newBoard();
		obj1.choose();
		obj1.showBoard();
		obj1.playerMove_1();
	}
}
