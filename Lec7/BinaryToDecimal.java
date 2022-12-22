package Lec7;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 61;
		int ans = 0;
		int p = 1;
		int base = 8;
		
		while(n != 0)
		{
			int rem = n%10;
			ans += rem * p;
			
			n = n/10;
			p = p*base;
		}
		System.out.println(ans);

	}

}
