package Lec28;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pp("nitin", "");
//		System.out.println("abc".substring(4));

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
	
	public static void pp(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans.substring(0,ans.length()-1));
		}
		else
		{
			for(int i = 1; i <= ques.length();i++)
			{
				String na = ques.substring(0,i);
				String nq = ques.substring(i);
				
				if(isPalindrome(na))
				{
					pp(nq, ans+na+"-");
				}	
			}
		}
	}
	
	

}
