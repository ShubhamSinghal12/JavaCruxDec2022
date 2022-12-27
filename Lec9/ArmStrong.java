package Lec9;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isArmstrong(97));
		printAllArmstrong(10,1000);
	}
	
	public static void printAllArmstrong(int li,int hi)
	{
		for(int i = li; i <= hi; i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static int digits(int n)
	{
		return (int)Math.log10(n)+1;
	}
	public static boolean isArmstrong(int n)
	{
		int d = digits(n);
		int sum = 0;
		int temp = n;
		while(n != 0)
		{
			int rem = n%10;
			sum += Math.pow(rem, d);
			
			n = n/10;
		}
		
		return sum == temp;
	}

}
