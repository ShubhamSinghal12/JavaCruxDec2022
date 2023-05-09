package Lec58;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,1};
		System.out.println(SumLessThanEqK(arr, 5));

	}
	
	
	public static int SumEqualsK(int[] nums,int k)
	{
		int count = 0;
		int start = 0;
		int sum = 0;
		int size = Integer.MAX_VALUE;
		for(int end = 0; end < nums.length; end++)
		{
			sum += nums[end];
			
			while(sum > k)
			{
				sum -= nums[start++];
			}
			
			if(sum == k)
			{
				count++;
				size = Math.min(size, end-start+1);
			}
		}
		return count;
	}
	
	
	public static int SumLessThanEqK(int[] nums,int k)
	{
		int count = 0;
		int start = 0;
		int sum = 0;
		for(int end = 0; end < nums.length; end++)
		{
			sum += nums[end];
			
			while(sum > k)
			{
				sum -= nums[start++];
			}
			
			count += end-start+1;
		}
		return count;
	}
	

}
