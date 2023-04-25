package Lec53;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int hr(int[] nums,int i)
	{
		if(i >= nums.length)
		{
			return 0;
		}
		else
		{
			int p = nums[i] + hr(nums,i+2);
			int np = hr(nums,i+1);
			
			return Math.max(p, np);
		}
	}
	
	 public int robR(int[] nums ,int i,int[] dp)
	    {
	        if(i == nums.length - 1)
			{
				return nums[i];
			}
	        else if(i == nums.length-2)
	        {
	        	return Math.max(nums[i], nums[i+1]);
	        }
	        else if(dp[i] != -1)
	        {
	            return dp[i];
	        }
			else
			{
				int p = nums[i] + robR(nums,i+2,dp);
				int np = robR(nums,i+1,dp);
				
				return dp[i] = Math.max(p, np);
			}
	    }
	 
	 
	public static int robBU(int[] nums)
	{
		int[] dp = new int[nums.length];
		dp[nums.length-1] = nums[nums.length-1];
		dp[nums.length-2] = Math.max(nums[nums.length-1], nums[nums.length-2]);
		
		for(int i = nums.length-3; i >= 0; i--)
		{
			int p = nums[i] + dp[i+2];
			int np = dp[i+1];
			
			dp[i] = Math.max(p, np);
		}
		return dp[0];
	}
	
	public static int robBUSE(int[] nums)
	{
//		int[] dp = new int[nums.length];
		int a = nums[nums.length-1];
		int b = Math.max(nums[nums.length-1], nums[nums.length-2]);
		
		for(int i = nums.length-3; i >= 0; i--)
		{
			int p = nums[i] + a;
			int np = b;
			
			int c = Math.max(p, np);
			
			a = b;
			b = c;
			
		}
		return b;
	}

}
