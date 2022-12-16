package Lec3;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 100;
		int n = 2;
		
		while(n<=N)
		{
			int i = 2;
			boolean count = true;
	//		int x = (int)Math.sqrt(n);
			while(i*i <= n)
			{
				if(n%i==0)
				{
					count = false;
					break;
				}
				i += 1;
			}
			
			if(count)
			{
				System.out.println(n);
			}
			
			n += 1;
		}
		

	}

}
