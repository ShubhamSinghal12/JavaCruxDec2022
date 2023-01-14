package Lec14;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5};
//		long start = System.currentTimeMillis();
		System.out.println(UpperBound(arr, 3));
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);

	}
	public static int binarySearch(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
			
	}
	
	
	public static int lowerBound(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		int ans = -1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else
			{
				ans =  mid;
				ei = mid-1;
			}
		}
		return ans;
			
	}
	
	public static int UpperBound(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		int ans = -1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else if(arr[mid] < ele)
			{
				si = mid+1;
			}
			else
			{
				ans =  mid;
				si = mid+1;
			}
		}
		return ans;
			
	}
}
