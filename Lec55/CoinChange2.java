package Lec55;

public class CoinChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int cc2(int[] coins,int i,int amount)
	{
		if(amount == 0)
		{
			return 1;
		}
		else if(i == coins.length)
		{
			return 0;
		}
		else
		{
			int p = 0;
			if(amount >= coins[i])
				p = cc2(coins, i, amount-coins[i]);
			int np = cc2(coins, i+1, amount);
			return p+np;
		}
		
	}
	
	
	
	public int cc2BU(int[] coins,int amount)
	{
		int[][] dp = new int[coins.length+1][amount+1];
		
		for(int i = 0; i <= coins.length; i++)
		{
			dp[i][0] = 1;
		}
		
		for(int i = coins.length-1; i >= 0; i--)
		{
			for(int j = 1; j <= amount; j++)
			{
				int p = 0;
				if(j >= coins[i])
					p = dp[i][j-coins[i]];
				int np = dp[i+1][j];
				dp[i][j] = p+np;
			}
		}
		
		return dp[0][amount];
	}
	
	
	public int cc2BUSE(int[] coins,int amount)
	{
		int[] dp = new int[amount+1];
		
		dp[0] = 1;
		
		for(int i = coins.length-1; i >= 0; i--)
		{
			for(int j = 1; j <= amount; j++)
			{
				int p = 0;
				if(j >= coins[i])
					p = dp[j-coins[i]];
				
				int np = dp[j];
				dp[j] = p+np;
			}
		}
		
		return dp[amount];
	}

}
