package Lec7;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345;
//		int ct = 0;
//		while(n!=0)
//		{
//			n = n/10;
//			ct++;
//		}
//		System.out.println(ct);
		
		int d = (int)Math.log10(n)+1;
		System.out.println(d);

	}

}
