package Lec4;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int a = 0;
		int b = 1;
		int i = 1;
//		System.out.print(a+" "+b+" ");
		while(i <= n-1)
		{
			int c = a+b;
			a = b;
			b = c;
//			System.out.print(b+" ");
			
			i++;
		}
		System.out.println(b);
		
	}

}
