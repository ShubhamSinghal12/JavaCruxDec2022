package Lec12;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,3,5};
		bubbleSort(arr);
//		System.out.println(Arrays.toString(arr));
		

	}
	public static void bubbleSort(int[] arr)
	{
		for(int i = 1; i < arr.length;i++)
		{
			int swap = 0;
			for(int j = 0; j < arr.length-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swap += 1;
				}
			}
			if(swap == 0)
				break;
			System.out.println(Arrays.toString(arr));
		}
	}
	

}
