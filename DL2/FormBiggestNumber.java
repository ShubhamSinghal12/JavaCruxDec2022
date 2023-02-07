package DL2;

import java.util.Arrays;

public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {54,548,546,60,9,98};
		bubbleSort(arr);

	}
	
	public static boolean compare(int a,int b)
	{
		String s1 = a+""+b;
		String s2 = b+""+a;
		return s1.compareTo(s2) < 0;
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 1; i < arr.length;i++)
		{
			int swap = 0;
			for(int j = 0; j < arr.length-i; j++)
			{
				if(compare(arr[j],arr[j+1]))
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swap += 1;
				}
			}
			if(swap == 0)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	

}
