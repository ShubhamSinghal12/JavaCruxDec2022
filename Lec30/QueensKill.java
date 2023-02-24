package Lec30;

public class QueensKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] board = new boolean[4][4];
//		qp(board, 2, "", 0);
//		qc(board, 2,"" , 0, 0, 0);
//		qcBr2(board, 0, 0, 2, 0, "");
//		qcKill(board, 4, "", 0, -1, 0);
//		qcBrKill(board, 0, 0, 4, 0, "");
		nQueenKill2(board, 0, 0, 4, "");
		
	}
	
	public static void qp(boolean[][] board,int tq,String ans,int qpsf)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				for(int j = 0; j < board[0].length; j++)
				{
					if(board[i][j] != true)
					{
						board[i][j] = true;
						qp(board, tq, ans+"q"+qpsf+"b"+i+j+" ", qpsf+1);
						board[i][j] = false;
					}
				}
			}
		}
	}
	
	
	public static void qc(boolean[][] board,int tq,String ans,int qpsf,int lasti,int lastj)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lasti; i < board.length; i++)
			{
				int j = 0;
				if(i == lasti)
					j = lastj;
				
				for(; j < board[0].length; j++)
				{
					if(board[i][j] != true)
					{
						board[i][j] = true;
						qc(board, tq, ans+"q"+"b"+i+j+" ", qpsf+1,i,j);
						board[i][j] = false;
					}
				}
			}
		}
	}
	
	public static void qcKill(boolean[][] board,int tq,String ans,int qpsf,int lasti,int lastj)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lasti+1; i < board.length; i++)
			{
				for(int j = 0; j < board[0].length; j++)
				{
					if(board[i][j] != true && isItPossible(board, i, j))
					{
						board[i][j] = true;
						qcKill(board, tq, ans+"q"+"b"+i+j+" ", qpsf+1,i,j);
						board[i][j] = false;
					}
				}
			}
		}
	}
	
	public static boolean isItPossible(boolean[][] board,int i,int j)
	{
		for(int col = j-1; col >= 0; col--)
		{
			if(board[i][col] == true)
				return false;
		}
		for(int col = j-1,row = i-1; row >= 0 && col >= 0;row--,col--)
		{
			if(board[row][col] == true)
				return false;
		}
		for(int row = i-1; row >= 0; row--)
		{
			if(board[row][j] == true)
				return false;
		}
		for(int col = j+1,row = i-1; row >= 0 && col < board[0].length;row--,col++)
		{
			if(board[row][col] == true)
				return false;
		}
		return true;
	}
	
	public static void qcBr(boolean[][] board,int i,int j, int tq,int qpsf,String ans)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else if(i >= board.length)
		{
			return;
		}
		else if(j == board[0].length)
		{
			qcBr(board, i+1, 0, tq, qpsf, ans);
		}
		else
		{
			//Place
			board[i][j] = true;
			qcBr(board, i,j+1, tq, qpsf+1, ans+"q"+"b"+i+j+" ");
			board[i][j] = false;
			
			
			//Not Place
			qcBr(board, i,j+1, tq, qpsf, ans);
		}
	}
	
	public static void qcBrKill(boolean[][] board,int i,int j, int tq,int qpsf,String ans)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else if(i >= board.length)
		{
			return;
		}
		else if(j == board[0].length)
		{
			qcBrKill(board, i+1, 0, tq, qpsf, ans);
		}
		else
		{
			//Place
			if(isItPossible(board, i, j))
			{
				board[i][j] = true;
				qcBrKill(board, i,j+1, tq, qpsf+1, ans+"q"+"b"+i+j+" ");
				board[i][j] = false;
			}
			
			//Not Place
			qcBrKill(board, i,j+1, tq, qpsf, ans);
		}
	}
	
	public static void qcBr2(boolean[][] board,int i,int j, int tq,int qpsf,String ans)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
			return;
		}
		if(j == board[0].length)
		{
			i = i+1;
			j = 0;
		}
		if(i >= board.length)
		{
			return;
		}
		else
		{
			//Place
			board[i][j] = true;
			qcBr2(board, i,j+1, tq, qpsf+1, ans+"q"+"b"+i+j+" ");
			board[i][j] = false;
			
			
			//Not Place
			qcBr2(board, i,j+1, tq, qpsf, ans);
		}
	}

	public static void nqueens(boolean[][] board,int tq,int qpsf,String ans)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else
		{
			for(int j = 0; j < board[0].length; j++)
			{
				if(isItPossible(board, qpsf, j))
				{
					board[qpsf][j] = true;
					nqueens(board, tq, qpsf+1, ans+"qb"+qpsf+j+" ");
					board[qpsf][j] = false;
				}
			}
		}
	}
	
public static void nQueenKill2(boolean[][]board, int j, int qpsf, int tq, String ans) {
		
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if(j >= board[0].length) {
			return;
		}
		else {
			
			//Place only if possible
			if(isItPossible(board, qpsf, j)) {
				board[qpsf][j] = true;
				nQueenKill2(board, 0, qpsf+1, tq, ans+"q"+"b"+qpsf+j+" ");
				board[qpsf][j] = false;
			}
			
			//Not place
			nQueenKill2(board, j+1, qpsf, tq, ans);
			
		}
	}

	
}
