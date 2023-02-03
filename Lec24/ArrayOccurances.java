package Lec24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,4,5,3,4,2,3,4,2,3};
//		System.out.println(search(arr, 0, 30));
//		ArrayList<Integer> ans  = new ArrayList<>();
//		storeallOccurance(arr, 0, 3, ans);
//		System.out.println(ans);
//		ArrayList<Integer> ans = storeallOccurance(arr, 0, 3);
//		System.out.println(ans);
		int[] ans = storeallOccurance2(arr, 0, 3, 0);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int search(int[] arr,int i,int target)
	{
		if(i == arr.length)
			return -1;
		else
		{
			if(arr[i] == target)
			{
				return i;
			}
			else
			{
				return search(arr, i+1, target);
			}
		}
	}
	
	public static int firstOccurance(int[] arr,int i,int target)
	{
		if(i == arr.length)
			return -1;
		else
		{
			if(arr[i] == target)
			{
				return i;
			}
			else
			{
				return firstOccurance(arr, i+1, target);
			}
		}
	}
	
	public static int lastOccurance(int[] arr,int i,int target,int ans)
	{
		if(i == arr.length)
			return ans;
		else
		{
			if(arr[i] == target)
			{
				ans = i;
			}
			
			return lastOccurance(arr, i+1, target,ans);
		}
	}
	
	public static int lastOccurance(int[] arr,int i,int target)
	{
		if(i == arr.length)
			return -1;
		else
		{
			int ans = lastOccurance(arr, i+1, target);
			
			if(ans == -1)
			{
				if(arr[i] == target)
				{
					return i;
				}
			}
			
			return ans;
		}
	}
	
	public static void printallOccurance(int[] arr,int i,int target)
	{
		if(i == arr.length)
			return;
		else
		{
			if(arr[i] == target)
			{
				System.out.println(i);
			}
			
			printallOccurance(arr, i+1, target);
		}
	}
	
	public static void storeallOccurance(int[] arr,int i,int target,ArrayList<Integer> ans)
	{
		if(i == arr.length)
			return;
		else
		{
			if(arr[i] == target)
			{
				ans.add(i);
			}
			
			storeallOccurance(arr, i+1, target,ans);
		}
	}
	
	public static ArrayList<Integer> storeallOccurance(int[] arr,int i,int target)
	{
		if(i == arr.length)
			return new ArrayList<Integer>();
		else
		{
			ArrayList<Integer> ans = storeallOccurance(arr, i+1, target);
			
			if(arr[i] == target)
			{
				ans.add(i);
			}
			
			return ans;
		}
	}
	
	
	public static int[] storeallOccurance2(int[] arr,int i,int target,int ct)
	{
		if(i == arr.length)
			return new int[ct];
		else
		{
			if(arr[i] == target)
			{
				ct++;
			}
			
			int[] ans = storeallOccurance2(arr, i+1, target,ct);
			
			if(arr[i] == target)
			{
				ans[ct-1] = i;
			}
			
			return ans;
		}
	}
	
	
	
}
