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
		winner();
	}
	public void computerMove_1()
	{
		location = ((int) (Math.random()*10)%9)+1;
		location();
		if(flag==0)
		{
			computerWinMove();
		}
		else
		{
			board[location]=board[location];
			computerMove_1();
		}
		showBoard();
		winner();
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
	public void winner()
	{
		if(((board[1]==player) && (board[2]==player) && (board[3]==player)) || 
		   ((board[4]==player) && (board[5]==player) && (board[6]==player)) || 
		   ((board[7]==player) && (board[8]==player) && (board[9]==player)) || 
		   ((board[1]==player) && (board[4]==player) && (board[7]==player)) ||
		   ((board[2]==player) && (board[5]==player) && (board[8]==player)) || 
		   ((board[3]==player) && (board[6]==player) && (board[9]==player)) || 
		   ((board[1]==player) && (board[5]==player) && (board[9]==player)) || 
		   ((board[3]==player) && (board[5]==player) && (board[7]==player)) )
		{
			System.out.println("Player is the Winner.");
		}
		else if(((board[1]==computer) && (board[2]==computer) && (board[3]==computer)) || 
				((board[4]==computer) && (board[5]==computer) && (board[6]==computer)) || 
				((board[7]==computer) && (board[8]==computer) && (board[9]==computer)) || 
				((board[1]==computer) && (board[4]==computer) && (board[7]==computer)) ||
				((board[2]==computer) && (board[5]==computer) && (board[8]==computer)) || 
				((board[3]==computer) && (board[6]==computer) && (board[9]==computer)) || 
				((board[1]==computer) && (board[5]==computer) && (board[9]==computer)) ||
				((board[3]==computer) && (board[5]==computer) && (board[7]==computer)) )
		{
			System.out.println("Computer is the Winner.");	
		}
		else if((board[1]!=' ') && (board[2]!=' ') && (board[3]!=' ') && 
		        (board[4]!=' ') && (board[5]!=' ') && (board[6]!=' ') && 
		        (board[7]!=' ') && (board[8]!=' ') && (board[9]!=' '))
		{
			System.out.println("It's a Tie");
		}
		else
		{
			nextMove();
		}
	}
	public void nextMove()
	{
		if(board[location]==player)
		{
			computerMove_1();
		}
		else
		{
			playerMove_1();
		}
	}
	public void computerWinMove()
	{
		if((board[1]==' ') && (board[2]==computer) && (board[3]==computer)) 
		{
			board[1]=computer;
			location=1;
		}
		else if((board[1]==computer) && (board[2]==' ') && (board[3]==computer))
		{
			board[2]=computer;
			location=2;
		}
		else if((board[1]==computer) && (board[2]==computer) && (board[3]==' '))
		{
			board[3]=computer;
			location=3;
		}
		else if((board[4]==' ') && (board[5]==computer) && (board[6]==computer))
		{
			board[4]=computer;
			location=4;
		}
		else if((board[4]==computer) && (board[5]==' ') && (board[6]==computer))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[4]==computer) && (board[5]==computer) && (board[6]==' '))
		{
			board[6]=computer;
			location=6;
		}
		else if((board[7]==' ') && (board[8]==computer) && (board[9]==computer))
		{
			board[7]=computer;
			location=7;
		}
		else if((board[7]==computer) && (board[8]==' ') && (board[9]==computer))
		{
			board[8]=computer;
			location=8;
		}
		else if((board[7]==computer) && (board[8]==computer) && (board[9]==' '))
		{
			board[9]=computer;
			location=9;
		}
		else if((board[1]==' ') && (board[4]==computer) && (board[7]==computer))
		{
			board[1]=computer;
			location=1;
		}
		else if((board[1]==computer) && (board[4]==' ') && (board[7]==computer))
		{
			board[4]=computer;
			location=4;
		}
		else if((board[1]==computer) && (board[4]==computer) && (board[7]==' '))
		{
			board[7]=computer;
			location=7;
		}
		else if((board[2]==' ') && (board[5]==computer) && (board[8]==computer))
		{
			board[2]=computer;
			location=2;
		}
		else if((board[2]==computer) && (board[5]==' ') && (board[8]==computer))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[2]==computer) && (board[5]==computer) && (board[8]==' '))
		{
			board[8]=computer;
			location=8;
		}
		else if ((board[3]==' ') && (board[6]==computer) && (board[9]==computer))
		{
			board[3]=computer;
			location=3;
		}
		else if((board[3]==computer) && (board[6]==' ') && (board[9]==computer))
		{
			board[6]=computer;
			location=6;
		}
		else if((board[3]==computer) && (board[6]==computer) && (board[9]==' '))
		{
			board[9]=computer;
			location=9;
		}
		else if((board[1]==' ') && (board[5]==computer) && (board[9]==computer))
		{
			board[1]=computer;
			location=1;
		}
		else if((board[1]==computer) && (board[5]==' ') && (board[9]==computer))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[1]==computer) && (board[5]==computer) && (board[9]==' '))
		{
			board[9]=computer;
			location=9;
		}
		else if((board[3]==' ') && (board[5]==computer) && (board[7]==computer))
		{
			board[3]=computer;
			location=3;
		}
		else if((board[3]==computer) && (board[5]==' ') && (board[7]==computer))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[3]==computer) && (board[5]==computer) && (board[7]==' '))
		{
			board[7]=computer;
			location=7;
		}
		else 
		{
			playerWinMove();
		}
	}
	public void playerWinMove()
	{
		if((board[1]==' ') && (board[2]==player) && (board[3]==player)) 
		{
			board[1]=computer;
			location=1;
		}
		else if((board[1]==player) && (board[2]==' ') && (board[3]==player))
		{
			board[2]=computer;
			location=2;
		}
		else if((board[1]==player) && (board[2]==player) && (board[3]==' '))
		{
			board[3]=computer;
			location=3;
		}
		else if((board[4]==' ') && (board[5]==player) && (board[6]==player))
		{
			board[4]=computer;
			location=4;
		}
		else if((board[4]==player) && (board[5]==' ') && (board[6]==player))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[4]==player) && (board[5]==player) && (board[6]==' '))
		{
			board[6]=computer;
			location=6;
		}
		else if((board[7]==' ') && (board[8]==player) && (board[9]==player))
		{
			board[7]=computer;
			location=7;
		}
		else if((board[7]==player) && (board[8]==' ') && (board[9]==player))
		{
			board[8]=computer;
			location=8;
		}
		else if((board[7]==player) && (board[8]==player) && (board[9]==' '))
		{
			board[9]=computer;
			location=9;
		}
		else if((board[1]==' ') && (board[4]==player) && (board[7]==player))
		{
			board[1]=computer;
			location=1;
		}
		else if((board[1]==player) && (board[4]==' ') && (board[7]==player))
		{
			board[4]=computer;
			location=4;
		}
		else if((board[1]==player) && (board[4]==player) && (board[7]==' '))
		{
			board[7]=computer;
			location=7;
		}
		else if((board[2]==' ') && (board[5]==player) && (board[8]==player))
		{
			board[2]=computer;
			location=2;
		}
		else if((board[2]==player) && (board[5]==' ') && (board[8]==player))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[2]==player) && (board[5]==player) && (board[8]==' '))
		{
			board[8]=computer;
			location=8;
		}
		else if ((board[3]==' ') && (board[6]==player) && (board[9]==player))
		{
			board[3]=computer;
			location=3;
		}
		else if((board[3]==player) && (board[6]==' ') && (board[9]==player))
		{
			board[6]=computer;
			location=6;
		}
		else if((board[3]==player) && (board[6]==player) && (board[9]==' '))
		{
			board[9]=computer;
			location=9;
		}
		else if((board[1]==' ') && (board[5]==player) && (board[9]==player))
		{
			board[1]=computer;
			location=1;
		}
		else if((board[1]==player) && (board[5]==' ') && (board[9]==player))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[1]==player) && (board[5]==player) && (board[9]==' '))
		{
			board[9]=computer;
			location=9;
		}
		else if((board[3]==' ') && (board[5]==player) && (board[7]==player))
		{
			board[3]=computer;
			location=3;
		}
		else if((board[3]==player) && (board[5]==' ') && (board[7]==player))
		{
			board[5]=computer;
			location=5;
		}
		else if((board[3]==player) && (board[5]==player) && (board[7]==' '))
		{
			board[7]=computer;
			location=7;
		}
		else 
		{
			cornerMove();
		}
	}
	public void cornerMove()
	{
		if(board[1]==' ')
		{
			board[1]=computer;
			location=1;
		}
		else if(board[3]==' ')
		{
			board[3]=computer;
			location=3;
		}
		else if(board[7]==' ')
		{
			board[7]=computer;
			location=7;
		}
		else if(board[9]==' ')
		{
			board[9]=computer;
			location=9;
		}
		else
		{
			board[location]=computer;
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
