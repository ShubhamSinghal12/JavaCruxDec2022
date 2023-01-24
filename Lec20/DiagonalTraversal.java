package Lec20;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		dt(arr);

	}
	
	public static void dt(int[][] arr)
	{
		int i = 0,j = 0;
		for(int k = 1; k < arr.length+arr[0].length;k++)
		{
			ArrayList<Integer> ans = new ArrayList<>();
			int si = i;
			int sj = j;
			while(si >= 0 && sj < arr[0].length)
			{
				ans.add(arr[si][sj]);
				si--;
				sj++;
			}
			if(k%2 != 0)
			{
				System.out.println(ans);
			}
			else
			{
				Collections.reverse(ans);
				System.out.println(ans);
			}
			
			if(i < arr.length-1)
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}

}
