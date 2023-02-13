package Lec28;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentWaystoAddParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(diff("2*3-4*5"));

	}
	public static boolean isOP(char ch)
	{
		return ch == '*' || ch == '+' || ch == '-';
	}
	
	public static int cal(int a,int b, char ch)
	{
		if(ch == '+')
			return a+b;
		else if(ch == '-')
			return a-b;
		else
			return a*b;
	}
	
	public static ArrayList<Integer> diff(String exp)
	{
		if(exp.indexOf('+') == -1 && exp.indexOf('*') == -1 && exp.indexOf('-') == -1 )
		{
			return new ArrayList<>(Arrays.asList(Integer.parseInt(exp)));
		}
		else
		{
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i = 0; i < exp.length(); i++)
			{
				if(isOP(exp.charAt(i)))
				{
					ArrayList<Integer> left = diff(exp.substring(0,i));
					ArrayList<Integer> right = diff(exp.substring(i+1));
					
					for(int val1 : left)
					{
						for(int val2 : right)
						{
							ans.add(cal(val1, val2, exp.charAt(i)));
						}
					}
				}
			}
			return ans;
		}
	}
}
