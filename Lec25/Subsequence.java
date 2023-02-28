package Lec25;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(ss("abcd"));
//		Asciiss("ab","");
		ss("abcd","");
		
	}
	
	public static ArrayList<String> ss(String s)
	{
		if(s.length() == 0)
		{
			return new ArrayList<>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = ss(s.substring(1));
			ArrayList<String> ans = new ArrayList<>();
			
			for(String val:rr)
			{
				ans.add(val);
				ans.add(s.charAt(0)+val);
			}
			
			return ans;
		}
	}
	
	
	public static ArrayList<String> Asciiss(String s)
	{
		if(s.length() == 0)
		{
			return new ArrayList<>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = Asciiss(s.substring(1));
			ArrayList<String> ans = new ArrayList<>();
			
			for(String val:rr)
			{
				ans.add(val);
				ans.add(s.charAt(0)+val);
				ans.add((int)s.charAt(0)+val);
			}
			
			return ans;
		}
	}
	
	public static void Asciiss(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			Asciiss(ques.substring(1),ans+ques.charAt(0));
			Asciiss(ques.substring(1),ans+(int)ques.charAt(0));
			Asciiss(ques.substring(1),ans);
//			ss(ques.substring(1),ans+ques.charAt(0));
		}
	}
	
	public static void ss(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			ss(ques.substring(1),ans);
			ss(ques.substring(1),ans+ques.charAt(0));
//			ss(ques.substring(1),ans+ques.charAt(0));
		}
	}
	
	
	
	
	
	
}
