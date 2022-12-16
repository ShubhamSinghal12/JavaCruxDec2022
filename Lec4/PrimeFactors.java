package Lec4;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		int i = 2;
		int li = 0;
//		while(n!=1)
//		{
//			if(n%i == 0)
//			{
//				if(i != li)
//				{
//					System.out.print(i+" ");
//					li = i;
//				}
//				n = n/i;
//			}
//			else
//			{
//				i++;
//			}
//		}
		
		
		while(n!=1)
		{
			boolean flag = true;
			while(n%i==0)
			{
				if(flag)
				{
					System.out.print(i+" ");
					flag = false;
				}
				n = n/i;
			}
			i++;
		}
		
	}

}
