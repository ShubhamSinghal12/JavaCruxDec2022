package Lec27;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tp("abaa","");

	}
	
	public static void p1(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = ques.charAt(0);
			for(int i = 0; i <= ans.length(); i++)
			{
				String na = ans.substring(0,i) + ch + ans.substring(i);
				p1(ques.substring(1), na);
			}
		}
	}
	public static void p2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				String nq = ques.substring(0,i)+ques.substring(i+1);
				p2(nq, ans+ques.charAt(i));
			}
		}
	}
	
	public static void tp(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length(); i++)
			{
				boolean flag = true;
				char ch = ques.charAt(i);
				for(int j = 0; j < i; j++)
					if(ques.charAt(j) == ch)
						flag = false;
				if(flag)
				{
					String nq = ques.substring(0,i)+ques.substring(i+1);
					tp(nq, ans+ques.charAt(i));
				}
			}
		}
	}

}
