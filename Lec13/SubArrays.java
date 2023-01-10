package Lec13;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,3,4,-5,8,-20,9};
		System.out.println(kadanes(arr));

	}
	
	public static void subArrays(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void SubArraySum(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				int sum = 0;
				for(int k = i; k <= j; k++)
				{
					sum += arr[k];
				}
				System.out.println(sum);
			}
		}
	}
	
	public static void SubArraySumEfficient(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				System.out.println(sum);
			}
		}
	}
	
	public static void MaxSubArraySum(int[] arr)
	{
		int maxS = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				if(sum > maxS)
					maxS = sum;
//				System.out.println(sum);
			}
		}
		System.out.println("Max: "+maxS);
	}
	
	public static int kadanes(int[] arr)
	{
		int maxS = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			if(sum > maxS)
				maxS = sum;
			if(sum < 0)
				sum = 0;
		}
		return maxS;
	}
}
