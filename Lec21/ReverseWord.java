package Lec21;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		System.out.println(reverseWBW2(s));
	}
	
	public static String reverseWbW(String s)
	{
		String ans = "";
		int lp = s.lastIndexOf(' ');
		while(lp != -1)
		{
			ans += s.substring(lp+1)+" ";
			s = s.substring(0,lp);
			
			lp = s.lastIndexOf(' ');
		}
		ans += s;
		
		return ans;
	}
	
	public static String reverseWBW2(String s)
	{
		String[] ast = s.split(" ");
		System.out.println(Arrays.toString(ast));
		
		String ans = "";
		for(int i = ast.length-1; i>0; i--)
		{
			ans += ast[i]+" ";
		}
		
		return ans+ast[0];
	}
	
}
