package Lec7;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123450;
		int ans = 0;
		while(n!=0)
		{
			int rem = n%10;
			ans = ans*10+rem;
			
			n = n/10;
		}
		System.out.println(ans);

	}

}
