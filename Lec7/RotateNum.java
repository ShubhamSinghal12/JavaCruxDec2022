package Lec7;

public class RotateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		
		int d = (int)(Math.log10(n))+1;
		
		int k = -107;
		k = k%d;
		if(k < 0)
			k += d;
		
		
//		int a = (int)Math.pow(10,d-1);
		
//		for(int i = 1; i <= k; i++)
//		{
//			int rem = n%10;
//			n = n/10 + rem*(int)Math.pow(10,d-1);
//		}
		
		int rem = n%(int)Math.pow(10, k);
		int ans = n/(int)Math.pow(10, k) + rem*(int)Math.pow(10, d-k);
		System.out.println(ans);
		
	}

}
