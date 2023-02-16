package Lec29;

public class QueensPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
//		qc(board, 2, "", 0,0);
		qcBr(board, 0, 2, 0,"");

	}
	public static void qp(boolean[] board,int tq,String ans,int qpsf)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < board.length; i++)
			{
				if(board[i] != true)
				{
					board[i] = true;
					qp(board, tq, ans+"q"+qpsf+"b"+i+" ", qpsf+1);
					board[i] = false;
				}
			}
		}
	}
	
	public static void qc(boolean[] board,int tq,String ans,int qpsf,int lastPlaced)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lastPlaced; i < board.length; i++)
			{
				if(board[i] != true)
				{
					board[i] = true;
					qc(board, tq, ans+"q"+qpsf+"b"+i+" ", qpsf+1,i+1);
					board[i] = false;
				}
			}
		}
	}

	public static void qcBr(boolean[] board,int i,int tq,int qpsf,String ans)
	{
		if(tq == qpsf)
		{
			System.out.println(ans);
		}
		else if(i >= board.length)
		{
			return;
		}
		else
		{
			//Place
			board[i] = true;
			qcBr(board, i+1, tq, qpsf+1, ans+"q"+"b"+i+" ");
			board[i] = false;
			
			
			//Not Place
			qcBr(board, i+1, tq, qpsf, ans);
		}
	}
	
	
	
}
