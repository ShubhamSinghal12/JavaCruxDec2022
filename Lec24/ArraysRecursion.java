package Lec24;

public class ArraysRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,10,4,5};
//		disp(arr, 0);
//		System.out.println();
//		disp2(arr, arr.length-1);
//		System.out.println();
//		disp(arr, 1, 3);
		System.out.println(max(arr,0));

	}
	
	public static void disp(int[] arr,int i)
	{
		if(i == arr.length)
		{
			return;
		}
		else
		{
			System.out.println(arr[i]);
			disp(arr, i+1);
		}
	}
	
	public static void disp2(int[] arr,int n)
	{
		if(n == 0)
		{
			System.out.println(arr[0]);
			return;
		}
		else
		{
			disp2(arr, n-1);
			System.out.println(arr[n]);
		}
	}
	
	public static void disp(int[] arr,int i,int n)
	{
		if(i == n)
		{
			System.out.println(arr[n]);
			return;
		}
		else
		{
			System.out.println(arr[i]);
			disp(arr, i+1,n);
		}
	}
	
	
	public static int max(int[] arr,int i)
	{
		if(i == arr.length-1)
		{
			return arr[i];
		}
		else
		{
			return Math.max(arr[i],max(arr,i+1));
		}
	}
	
	
}
