package Lec33;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] merge(int[] arr,int[] brr)
	{
		int i = 0;
		int j = 0;
		int[] ans = new int[arr.length+brr.length];
		int k = 0;
		while(i < arr.length && j < brr.length)
		{
			if(arr[i] < brr[j])
			{
				ans[k] = arr[i];
				i++;
			}
			else
			{
				ans[k] = brr[j];
				j++;
			}
			k++;
		}
		while(i < arr.length)
		{
			ans[k] = arr[i];
			k++;
			i++;
		}
		while(j < brr.length)
		{
			ans[k] = brr[j];
			k++;
			j++;
		}
		return ans;
	}

}
