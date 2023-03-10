package Lec41;

import java.util.LinkedList;
import java.util.Queue;

public class FirstKNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,-1,-7,8,-15,30,16,28};
		fkn(arr, 3);

	}
	
	public static void fkn(int[] arr,int k)
	{
		Queue<Integer> qt = new LinkedList<>();
		for(int i = 0; i < k; i++)
		{
			if(arr[i] < 0)
			{
				qt.add(i);
			}
		}
		if(qt.isEmpty())
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(arr[qt.peek()]);
		}
		for(int i = k; i < arr.length; i++)
		{
			if(arr[i] < 0)
			{
				qt.add(i);
			}
			if(!qt.isEmpty() && qt.peek() == i-k)
				qt.remove();
			
			if(qt.isEmpty())
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(arr[qt.peek()]);
			}
			
		}
		
	}

}
