package Lec12;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,3,7,6,9,8,10};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insert(int[] arr,int ele)
	{
		int temp = arr[ele];
		int i = ele-1;
		while(i >= 0)
		{
			if(arr[i] > temp)
			{
				arr[i+1] = arr[i];
			}
			else
			{
				break;
			}
			i--;
		}
		arr[i+1] = temp;
	}
	public static void insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			insert(arr, i);
		}
	}

}
