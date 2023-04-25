package Lec53;

public class FibonacciDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fib(50));
		int n = 10000;
		System.out.println(fibTD(n, new int[n+1]));
		System.out.println(fibBU(n));

	}
	
	public static int fib(int n)
	{
		if(n == 1 || n == 0)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	
	public static int fibTD(int n,int[] dp)
	{
		if(n == 1 || n == 0)
		{
			return n;
		}
		else if(dp[n] != 0)
		{
			return dp[n];
		}
		else
		{
			dp[n] =  fibTD(n-1,dp)+fibTD(n-2,dp);
			return dp[n];
		}
	}
	
	public static int fibBU(int n)
	{
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2;i <= n; i++)
		{
			dp[i] =  dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	public static int fibBUSE(int n)
	{
		int a = 0;
		int b = 1;
		
		for(int i = 2;i <= n; i++)
		{
			int c = a + b;
			 a = b;
			 b = c;
		}
		return b;
	}

}
