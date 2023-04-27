package Lec54;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int hr(int[] nums,int i)
	{
		if(i < 0)
		{
			return 0;
		}
		else
		{
			int p = nums[i] + hr(nums,i-2);
			int np = hr(nums,i-1);
			
			return Math.max(p, np);
		}
	}
	
	public int robR(int[] nums ,int i,int[] dp)
    {
        if(i == 0)
		{
			return nums[0];
		}
        else if(i == 1)
        {
        	return Math.max(nums[0], nums[1]);
        }
        else if(dp[i] != -1)
        {
            return dp[i];
        }
		else
		{
			int p = nums[i] + robR(nums,i-2,dp);
			int np = robR(nums,i-1,dp);
			
			return dp[i] = Math.max(p, np);
		}
    }
	
	
	public int HRBU(int[] nums)
	{
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for(int i = 2; i < nums.length; i++)
		{
			int p = nums[i] + dp[i-2];
			int np = dp[i-1];
			
			dp[i] = Math.max(p, np);
		}
		return dp[nums.length-1];
	}
	
	
	

}
