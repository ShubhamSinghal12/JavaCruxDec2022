package Lec40;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,18,7,3,21,2,1,20,3,1,2,4};
		System.out.println(Arrays.toString(ng(arr)));

	}
	public static int[] ng(int[] arr)
	{
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[st.peek()] < arr[i])
			{
				int x = st.pop();
				ans[x] = arr[i];
			}
			st.push(i);
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[st.peek()] < arr[i])
			{
				int x = st.pop();
				if(ans[x] == 0)
					ans[x] = arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			int x = st.pop();
			if(ans[x] == 0)
				ans[x] = -1;
		}
		return ans;
	}

}
