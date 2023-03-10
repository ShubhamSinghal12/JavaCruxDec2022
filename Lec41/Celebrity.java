package Lec41;

import java.util.Stack;

public class Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findCeleb(int n,int[][] arr)
	{
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < n; i++)
		{
			st.push(i);
		}
		while(st.size() != 1)
		{
			int a = st.pop();
			int b = st.pop();
			
			if(arr[a][b] == 1)
			{
				st.push(b);
			}
			else
			{
				st.push(a);
			}
		}
		int celeb = st.pop();
		for(int i = 0; i < n; i++)
		{
			if(i != celeb && (arr[celeb][i] != 0 || arr[i][celeb] != 1))
			{
				return -1;
			}
		}
		
		return celeb;
	}

}
