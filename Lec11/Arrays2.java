package Lec11;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		rotate_k2(arr,-107);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void rotate_k2(int[] arr,int k)
	{
		k = k%arr.length;
		if(k<0)
			k += arr.length;
		
//		reverse(arr, 0, arr.length-k-1); // A reverse
//		reverse(arr, arr.length-k, arr.length-1); //B reverse
//		reverse(arr, 0, arr.length-1);// Whole reverse
		
		
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		
	}
	
	public static void reverse(int[] arr,int si,int ei)
	{
		while(si < ei)
		{
			swap(arr,si,ei);
			si++;
			ei--;
		}
	}
	
	public static void rotate_k(int[] arr,int k)
	{
		k = k%arr.length;
		if(k<0)
			k += arr.length;
		for(int i = 1; i <= k; i++)
		{
			rotate_1(arr);
		}
	}
	
	
	public static void rotate_1(int[] arr)
	{
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i >= 1; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	
	public static int maxA(int[] arr)
	{
		int maxi = 0;
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > arr[maxi])
			{
				maxi = i;
			}
		}
		return maxi;
	}
	
	
	public static int sumA(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}
	
	public static void swap(int[] arr, int a,int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static void reverse1(int[] arr)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si < ei)
		{
			swap(arr,si,ei);
			si++;
			ei--;
		}
	}
	
	
	public static void reverse2(int[] arr)
	{
		for(int i = 0; i < arr.length/2; i++)
		{
			swap(arr,i,arr.length-1-i);
		}
	}
	
	
}
