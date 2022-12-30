package Lec10;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = takeInput();
		int[] brr = {5,4,3,2,1};
//		brr = arr;
		
//		System.out.println(arr);
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
//		arr[0]=100;
//		System.out.println(arr[0]);
//		System.out.println("----------------");
		display(arr);
		display(brr);
//		System.out.println(arr);
//		System.out.println(brr);
//		
//		System.out.println(equate(arr, brr));
		
		swap3(arr, brr);
		System.out.println("--------------------");
		display(arr);
		display(brr);
		
	}
	public static void swap3(int[] arr,int[]brr)
	{
		int[] t = arr;
		arr = brr;
		brr = t;
		System.out.println("----In Swap-----");
		display(arr);
		display(brr);
	}
	public static void swap2(int[] arr,int[] brr, int id)
	{
		int t = arr[id];
		arr[id] = brr[id];
		brr[id] = t;
	}
	
	public static void swap(int a,int b)
	{
		int t = a;
		a = b;
		b = t;
	}
	
	public static void display(int[] arr)
	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	public static boolean equate(int[] arr,int[] brr)
	{
		if(arr.length != brr.length)
			return false;
		else
		{
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] != brr[i])
				{
					return false;
				}
			}
			return true;
		}
	}
	
	
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	
}
