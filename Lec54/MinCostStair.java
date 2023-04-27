package Lec54;

public class MinCostStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minCostClimbingStairs(int[] cost,int i) {
        
		if(i >= cost.length)
		{
			return 0;
		}
		else
		{
			int one = minCostClimbingStairs(cost, i+1);
			int two = minCostClimbingStairs(cost, i+2);
			
			return cost[i]+Math.min(one, two);
		}
    }
	
	
	public int minCostClimbingStairsTD(int[] cost,int i,int[] dp) {
        
		if(i >= cost.length)
		{
			return 0;
		}
		if(dp[i] != 0)
		{
			return dp[i];
		}
		else
		{
			int one = minCostClimbingStairsTD(cost, i+1,dp);
			int two = minCostClimbingStairsTD(cost, i+2,dp);
			
			return dp[i] = cost[i]+Math.min(one, two);
		}
    }
	
	public int minCostBU(int[] cost)
	{
		int[] dp = new int[cost.length+2];
		
		for(int i = cost.length-1; i>= 0; i--)
		{	
			dp[i] = cost[i]+Math.min(dp[i+1], dp[i+2]);
		}
		
		return Math.min(dp[0], dp[1]);
				
	}
	
	

}
