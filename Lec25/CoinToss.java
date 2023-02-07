package Lec25;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinToss2(3, ""));
		System.out.println(ss(2).size());

	}
	public static ArrayList<String> ss(int n)
	{
		if(n == 0)
		{
			return new ArrayList<>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = ss(n-1);
			ArrayList<String> ans = new ArrayList<>();
			
			for(String val:rr)
			{
				ans.add(val+"H");
				ans.add(val+"T");
			}
			
			return ans;
		}
	}
	
	public static int coinToss(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			count += coinToss(n-1, ans+"H");
			count += coinToss(n-1, ans+"T");
			return count;
		}
	}
	
	public static int coinToss2(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int count = 0;
			if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H')
			{
				count += coinToss2(n-1, ans+"H");
			}
			count += coinToss2(n-1, ans+"T");
			return count;
		}
	}
}
