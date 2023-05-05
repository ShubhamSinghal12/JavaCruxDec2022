package Lec57;

public class OPtimalGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,200,20,2};
		System.out.println(opg(nums, 0, nums.length-1));
		System.out.println(ansBU(nums));

	}
	public static boolean PredictTheWinner(int[] nums) {

	        int sum = 0;
	        for(int i = 0; i < nums.length; i++)
	        {
	            sum += nums[i];
	        }
	        return opg(nums,0,nums.length-1) >= (sum+1)/2;
	    }

	    public static int opg(int[] nums,int si,int ei)
	    {
	        if(si > ei)
	        {
	            return 0;
	        }
	        else
	        {
	            int f = nums[si]+Math.min(opg(nums,si+2,ei),opg(nums,si+1,ei-1));
	            int s = nums[ei]+Math.min(opg(nums,si,ei-2),opg(nums,si+1,ei-1));

	            return Math.max(f,s);
	        }
	    }
	    
	    
	    public static int ansBU(int[]nums)
		{
			int[][]dp = new int[nums.length+2][nums.length+2];
			
//			for(int i = 0; i < nums.length; i++)
//			{
//				for(int j = 0; j < nums.length; j++)
//				{
//					if(i > j)
//					{
//						dp[i][j] = 0;
//					}
//				}
//			}
			
			for(int i = dp.length - 3; i >= 0; i--)
			{
				for(int j = i+2; j < dp[0].length;j++)
				{
					int f = nums[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]);
					int l = nums[j-2] + Math.min(dp[i + 1][j - 1], dp[i][j - 2]);
					
					dp[i][j] = Math.max(f, l);
				}
			}
			return dp[0][dp[0].length - 1];
		}

}
