package com.TicTacToeGame;

import java.util.Scanner;

public class TicTacToeGame 
{
	public static int PLAYER_TOSS=0;
	public static int COMPUTER_TOSS=1;
	int tossCheck;
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
			System.out.println(board[i]);
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
		Scanner sc=new Scanner(System.in);
		location=sc.nextInt();
		location();
		if(flag==0)
		{
			board[location]=player;
		}
		else
		{
			board[location]=board[location];
			playerMove_1();
		}
		showBoard();
	}
	public void computerMove_1()
	{
		location = ((int) (Math.random()*10)%9)+1;
		location();
		if(flag==0)
		{
			board[location]=computer;
		}
		else
		{
			board[location]=board[location];
			computerMove_1();
		}
		showBoard();
	}
	public void toss()
	{
		tossCheck=(int) (Math.random()*10)%2;
		System.out.println("Toss is: "+tossCheck);
		if(tossCheck==PLAYER_TOSS)
		{
			System.out.println("Player Starts First");
			playerMove_1();
		}
		else
		{
			System.out.println("Computer Starts First");
			computerMove_1();
		}		
	}
	public static void main(String[] args)
	{
		TicTacToeGame obj1=new TicTacToeGame();
		obj1.newBoard();
		obj1.choose();
		obj1.showBoard();
		obj1.toss();
	}
}
