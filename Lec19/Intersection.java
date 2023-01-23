package Lec19;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,1,2,2,2,3,4,4,5,6,6,7,7,8};
		int[] arr2 = {1,1,1,3,4,7,9,10,10,11,11,13};
		
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
		}
		System.out.println(ans);
		

	}
	
	

}
