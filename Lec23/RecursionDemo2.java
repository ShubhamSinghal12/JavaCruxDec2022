package Lec23;

public class RecursionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(power(2,4));
//		System.out.println(fib(4));
//		System.out.println(SumNTail(5, 0));
//		System.out.println(factTail(5, 1));
		System.out.println(fibTail(7, 0, 1));
	}
	
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	
	public static int factTail(int n,int ans)
	{
		if(n==0)
		{
			return ans;
		}
		else
		{
			return factTail(n-1,ans*n);
		}
	}
	
	public static int power(int a,int b)
	{
		if(b == 0)
		{
			return 1;
		}
		else
		{
			return a*power(a,b-1);
		}
	}
	
	public static int fib(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static int fibTail(int n,int a,int b)
	{
		if(n == 0)
		{
			return a;
		}
		else
		{
			return fibTail(n-1,b,a+b);
		}
	}
	
	public static int SumNTail(int n,int sum)
	{
		if(n == 0)
			return sum;
		else
			return SumNTail(n-1,sum+n);
	}

}
