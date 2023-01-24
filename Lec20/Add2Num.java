package Lec20;

import java.util.ArrayList;
import java.util.Collections;

public class Add2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,3,6};
		int[] brr = {9,6,6,6,4};
		add(arr, brr);

	}
	
	public static void add(int[] arr,int[] brr)
	{
		int i = arr.length-1;
		int j = brr.length-1;
		int c = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		while(i >= 0 || j>= 0)
		{
			int sum = 0;
			sum += c;
			if(i >= 0)
			{
				sum += arr[i];
				i--;
			}
			if(j >= 0)
			{
				sum += brr[j];
				j--;
			}
			
			ans.add(sum%10);
			c = sum/10;
		}
		
		if(c == 1)
			ans.add(1);
		
		Collections.reverse(ans);
		System.out.println(ans);
	}

}
