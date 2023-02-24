package Lec34;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,8,7,3,6,1,5};
//		System.out.println(partition(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static int partition(int[] arr)
	{
		int pivot = arr[arr.length-1];
		int j = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] <= pivot)
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				j++;
			}
		}
		return j-1;
	}
	
	public static int partition(int[] arr,int si,int ei)
	{
		int pivot = arr[ei];
		int j = si;
		for(int i = si; i <= ei; i++)
		{
			if(arr[i] <= pivot)
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				j++;
			}
		}
		return j-1;
	}
	
	public static int rpartition(int[] arr,int si,int ei)
	{
		Random r = new Random();
		int p = r.nextInt(ei-si+1)+si;
		int t = arr[p];
		arr[p] = arr[ei];
		arr[ei] = t;
		
		int pivot = arr[ei];
		int j = si;
		for(int i = si; i <= ei; i++)
		{
			if(arr[i] <= pivot)
			{
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				j++;
			}
		}
		return j-1;
	}
	
	public static void quickSort(int[] arr,int si,int ei)
	{
		if(si >= ei)
		{
			return;
		}
		else
		{
			int pivot = rpartition(arr,si,ei);
			quickSort(arr, si, pivot-1);
			quickSort(arr, pivot+1, ei);
		}
	}
	
	
	
	
	
	
	

}
