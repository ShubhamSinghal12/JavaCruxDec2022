package DL2;

public class MaxSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int maxSumPath(int[] arr,int[] brr)
	{
		
		int sum = 0;
		int sumA = 0;
		int sumB = 0;
		int i = 0;
		int j = 0;
		while(i < arr.length && j < brr.length)
		{
			if(arr[i] > brr[j])
			{
				sumB += brr[j];
				j++;
			}
			else if(arr[i] < brr[j])
			{
				sumA += arr[i];
				i++;
			}
			else
			{
				sum += Math.max(sumA, sumB);
				sum += arr[i];
				i++;
				j++;
				
				sumA = 0;
				sumB = 0;
			}
		}
		
		while(i < arr.length)
		{
			sumA += arr[i];
			i++;
		}
		while(j < brr.length)
		{
			sumB += brr[j];
			j++;
		}
		
		sum += Math.max(sumA, sumB);
		
		return sum;
	}

}
