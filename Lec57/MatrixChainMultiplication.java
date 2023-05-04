package Lec57;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] matrix = {10,30,5,60};
		System.out.println(mcmBU(matrix));

	}
	public static int mcm(int[] matrix,int si,int ei)
	{
		if(si+1==ei)
		{
			return 0;
		}
		else
		{
			int ans = Integer.MAX_VALUE;
			
			for(int k = si+1; k < ei; k++)
			{
				int f = mcm(matrix, si, k);
				int s = mcm(matrix, k, ei);
				int self = matrix[si]*matrix[k]*matrix[ei];
				
				ans = Math.min(ans, self+f+s);
			}
			return ans;
		}
	}
	
	public static int mcmBU(int[] matrix)
	{
		int[][] dp = new int[matrix.length][matrix.length];
		
		for(int i = 0; i < matrix.length-1; i++)
		{
			dp[i][i+1] = 0;
		}
		
		for(int i = matrix.length-3; i >= 0; i--)
		{
			for(int j = i+2; j < matrix.length; j++)
			{
				int ans = Integer.MAX_VALUE;
				
				for(int k = i+1; k < j; k++)
				{
					int f = dp[i][k];
					int s = dp[k][j];
					int self = matrix[i]*matrix[k]*matrix[j];
					
					ans = Math.min(ans, self+f+s);
				}
				dp[i][j] = ans;
			}
		}
		
		return dp[0][matrix.length-1];
	}

}
