package Lec7;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 49;
		int ans = 0;
		int p = 1;
		int base = 2;
		
		while(n != 0)
		{
			int rem = n%base;
			ans += rem * p;
			
			n = n/base;
			p = p*10;
		}
		System.out.println(ans);

	}

}
