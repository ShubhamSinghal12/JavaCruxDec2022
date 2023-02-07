package Lec25;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stairs(5, ""));

	}
	public static int stairs(int n,int step,String ans)
	{
		if(step == n)
		{
			System.out.println(ans);
			return 1;
		}
		else if(step > n)
		{
			return 0;
		}
		else
		{
			int count = 0;
			count += stairs(n, step+1, ans+"1");
			count += stairs(n, step+2, ans+"2");
			return count;
		}
	}
	
	public static int stairs(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else if(n < 0)
		{
			return 0;
		}
		else
		{
			int count = 0;
			count += stairs(n-1, ans+"1");
			count += stairs(n-2, ans+"2");
			return count;
		}
	}
	
}
