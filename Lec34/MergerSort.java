package Lec34;

import java.util.Arrays;

public class MergerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr = new int[]{3,4,2,6,5,1};
		arr = mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		

	}
	public static int[] merge(int[] arr,int[] brr)
	{
		int i = 0;
		int j = 0;
		int[] ans = new int[arr.length+brr.length];
		int k = 0;
		while(i < arr.length && j < brr.length)
		{
			if(arr[i] < brr[j])
			{
				ans[k] = arr[i];
				i++;
			}
			else
			{
				ans[k] = brr[j];
				j++;
			}
			k++;
		}
		while(i < arr.length)
		{
			ans[k] = arr[i];
			k++;
			i++;
		}
		while(j < brr.length)
		{
			ans[k] = brr[j];
			k++;
			j++;
		}
		return ans;
	}
	
	public static int[] mergeSort(int[] arr,int si,int ei)
	{
		if(si == ei)
		{
			return new int[]{arr[si]};
		}
		else
		{
			int mid = (si+ei)/2;
			int[] left = mergeSort(arr, si, mid);
			int[] right = mergeSort(arr, mid+1, ei);
			return merge(left, right);
		}
		
	}

}
