package Lec57;

public class OPtimalGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean PredictTheWinner(int[] nums) {

	        int sum = 0;
	        for(int i = 0; i < nums.length; i++)
	        {
	            sum += nums[i];
	        }
	        return opg(nums,0,nums.length-1) >= (sum+1)/2;
	    }

	    public int opg(int[] nums,int si,int ei)
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
	    
}
