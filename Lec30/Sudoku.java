package Lec30;

import java.util.Arrays;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
				{5, 2, 0, 0, 0, 0, 0, 0, 0},
				{0, 8, 7, 0, 0, 0, 0, 3, 1},
				{0, 0, 3, 0, 1, 0, 0, 8, 0},
				{9, 0, 0, 8, 6, 3, 0, 0, 5},
				{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
				{1, 3, 0, 0, 0, 0, 2, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 7, 4},
				{0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		sudoku(grid, 0, 0);

	}
	
	public static boolean isItPossible(int[][] board,int i,int j,int val)
	{
		for(int row = 0; row < board.length; row++)
		{
			if(board[row][j] == val)
				return false;
		}
		for(int col = 0; col < board[0].length; col++)
		{
			if(board[i][col] == val)
				return false;
		}
		
		int x = i - i%3;
		int y = j - j%3;
		
//		int x = (x/3)*3;
//		int y = (y/3)*3;
		
		for(int row = x;row <x+3;row++)
		{
			for(int col = y; col < y+3; col++)
			{
				if(board[row][col]==val)
					return false;
			}
		}
		return true;
	}
	
	public static void sudoku(int[][] board,int i,int j)
	{
		if(i == board.length)
		{
			for(int[] a:board)
			{
				System.out.println(Arrays.toString(a));
			}
		}
		else if(j == board[0].length)
		{
			sudoku(board, i+1, 0);
		}
		else if(board[i][j] != 0)
		{
			sudoku(board, i, j+1);
		}
		else
		{
			for(int val = 1; val <= 9; val++)
			{
				if(isItPossible(board, i, j, val))
				{
					board[i][j] = val;
					sudoku(board, i, j+1);
					board[i][j] = 0;
				}
			}
		}
	}

}
