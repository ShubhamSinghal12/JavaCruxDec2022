package Lec56;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] wt  = {10,50,30,80,20};
		int[] cost = {100,600,500,1000,400};
		int cap = 90;
		System.out.println(kp(wt, cost, 0, cap,new int[wt.length][cap+1]));
		System.out.println(kpBU(wt, cost, cap));

	}
	
	public static int kp(int[] wt,int[] cost,int i,int cap)
	{
		if(i >= wt.length)
		{
			return 0;
		}
		
		int p = 0;
		if(wt[i] <= cap)
		{
			p = cost[i] + kp(wt, cost, i+1, cap-wt[i]);
		}
		
		int np = kp(wt, cost, i+1, cap);
		
		return Math.max(p, np);
	}
	
	public static int kp(int[] wt,int[] cost,int i,int cap,int[][] dp)
	{
		if(i >= wt.length)
		{
			return 0;
		}
		else if(dp[i][cap] != 0)
		{
			return dp[i][cap];
		}
		
		int p = 0;
		if(wt[i] <= cap)
		{
			p = cost[i] + kp(wt, cost, i+1, cap-wt[i],dp);
		}
		
		int np = kp(wt, cost, i+1, cap,dp);
		
		return dp[i][cap] = Math.max(p, np);
	}
	
	public static int kpBU(int[] wt,int[] cost,int cap)
	{
		int[][] dp = new int[wt.length+1][cap+1];
		
		
		for(int i = wt.length-1; i >= 0 ; i--)
		{
			for(int j = cap; j >= 0; j--)
			{
				int p = 0;
				if(wt[i] <= j)
				{
					p = cost[i] + dp[i+1][j-wt[i]];
				}
				
				int np = dp[i+1][j];
				
				dp[i][j] = Math.max(p, np);
			}
		}
		
		return dp[0][cap];
	}
	

}
