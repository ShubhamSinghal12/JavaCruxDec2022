package Lec16;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		productExceptSelf(arr);

	}
	
	public static  int[] productExceptSelf(int[] nums) {
        
//		int[] ans = new int[nums.length];
		int[] lp = new int[nums.length];
//		int[] rp = new int[nums.length];
		
		lp[0] = 1;
		for(int i = 1; i < nums.length; i++)
		{
			lp[i] = lp[i-1]*nums[i-1];
		}
		System.out.println(Arrays.toString(lp));
		
		int p = 1;
		for(int i = nums.length-1; i >= 0; i--)
		{
			lp[i] = p*lp[i];
			p = p*nums[i];
		}
//		System.out.println(Arrays.toString(rp));
//		
//		for(int i = 0; i < nums.length; i++)
//		{
//			ans[i] = lp[i]*rp[i];
//		}
//		System.out.println(Arrays.toString(ans));
//		return ans;
		System.out.println(Arrays.toString(lp));
		return lp;
    }

}
