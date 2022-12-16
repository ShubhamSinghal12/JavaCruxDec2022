package Lec4;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 28;
		int b = 34;
//		int min = Math.min(a, b);
//		int i = 1;
//		int hcf = 1;
//		while(i <= min)
//		{
//			if(a%i == 0 && b%i == 0)
//			{
//				hcf = i;
//			}
//			i++;
//		}
//		System.out.println(hcf);
		
		
		while(a%b!=0)
		{
			int rem = a%b;
			a = b;
			b = rem;
		}
		System.out.println(b);

	}

}
