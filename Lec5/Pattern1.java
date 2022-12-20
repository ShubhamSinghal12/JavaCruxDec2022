package Lec5;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		int row = 1;
		int nst = n;
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			row += 1;
			System.out.println();
		}
		

	}

}
