package Lec22;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(SumN(5));
//		PrinInc(5);

		PID(1,5);
	}
	
	public static int SumN(int n)
	{
		if(n == 1)
			return 1;
		else
			return SumN(n-1)+n;
	}
	
	public static void PrintDecreasing(int n)
	{
		if(n <= 0)
		{
			return;
		}
		else
		{
			System.out.println(n);
			PrintDecreasing(n-1);
		}
	}
	public static void PrinInc(int n)
	{
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			PrinInc(n-1);
			System.out.println(n);
		}
	}
	
	public static void PrinInc(int i,int n)
	{
		if(n == i)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(i);
			PrinInc(i+1,n);
		}
	}
	
	public static void PID(int i,int n)
	{
		if(i == n)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(i);
			PID(i+1,n);
			System.out.println(i);
		}
	}
	

}
