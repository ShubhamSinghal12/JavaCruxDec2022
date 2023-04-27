package Lec54;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int LIS(int[] nums,int i)
	{
		int max = 0;
		for(int j = i+1; j < nums.length; j++)
		{
			if(nums[j] > nums[i])
			{
				max = Math.max(max, LIS(nums,j));
			}
		}
		return max+1;
	}
	
	public static int LISTD(int[] nums,int i,int[] dp)
	{
		if(dp[i] != 0)
		{
			return dp[i];
		}
		int max = 0;
		for(int j = i+1; j < nums.length; j++)
		{
			if(nums[j] > nums[i])
			{
				max = Math.max(max, LIS(nums,j));
			}
		}
		return dp[i] = max+1;
	}
	
	
	public int LISBU(int[] nums)
	{
		int[] dp = new int[nums.length];
		
		for(int i = nums.length-1; i >= 0; i--)
		{
			int max = 0;
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[j] > nums[i])
				{
					max = Math.max(max, dp[j]);
				}
			}
			dp[i] = max+1;
		}
		
		int max = 0;
		for(int i = 0; i < dp.length; i++)
		{
			Math.max(max, dp[i]);
		}
		
		return max;
	}

}
