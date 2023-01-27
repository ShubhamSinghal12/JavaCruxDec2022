package Lec21;

public class StringQPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SS2("Hello");
//		char ch = '9';
//		int i = ch-'0';
//		System.out.println(i);
		PalindromSS("nitinn");
		
	}
	
	public static void SS(String s)
	{
		for(int i = 0;i < s.length(); i++)
		{
			for(int j = i+1; j <= s.length(); j++)
			{
				System.out.print(s.substring(i,j)+" ");
			}
			System.out.println();
		}
	}
	public static void PalindromSS(String s)
	{
		int count = 0;
		for(int i = 0;i < s.length(); i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				String ps = s.substring(i,j+1);
				boolean flag = true;
				int si = 0;
				int ei = ps.length()-1;
				while(si < ei)
				{
					if(ps.charAt(ei)!=ps.charAt(si))
						flag = false;
					si++;
					ei--;
				}
				
				if(flag)
				{
					System.out.println(ps+" ");
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void SS2(String s)
	{
		for(int i = 1; i <= s.length(); i++)
		{
			for(int j = 0; j <= s.length()-i; j++)
			{
				System.out.print(s.substring(j,j+i)+" ");
			}
			System.out.println();
		}
	}
	
	
	public static boolean isPalindrome(String s)
	{
		int si = 0;
		int ei = s.length()-1;
		while(si < ei)
		{
			if(s.charAt(ei)!=s.charAt(si))
				return false;
			si++;
			ei--;
		}
		return true;
	}
	
	
}
