package Lec41;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,6,2,3};
		System.out.println(histogram(arr));

	}
	
	public static int histogram(int[] heights)
	{
		Stack<Integer> st = new Stack<>();
		int maxArea = 0;
		for(int i = 0; i < heights.length; i++)
		{
			while(!st.isEmpty() && heights[i] < heights[st.peek()])
			{
				int x = st.pop();
				int left = -1;
				if(!st.isEmpty())
					left = st.peek();
				int area = heights[x] * (i-left-1);
				maxArea = Math.max(maxArea, area);
			}
			st.push(i);
		}
		
		while(!st.isEmpty())
		{
			int x = st.pop();
			int left = -1;
			if(!st.isEmpty())
				left = st.peek();
			int area = heights[x] * (heights.length-left-1);
			maxArea = Math.max(maxArea, area);
		}
		
		return maxArea;
	}

}
