package Lec33;

public class FastPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 9));

	}
	public static int power(int a,int n)
	{
		if(n == 1)
		{
			return a;
		}
		else
		{
			
			int b = power(a,n/2);
			if(n%2 == 0)
			{
				return b*b;
			}
			else
			{
				return b*b*a;
			}
			
		}
	}

}
