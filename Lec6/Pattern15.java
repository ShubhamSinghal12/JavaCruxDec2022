package Lec6;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nst = n;
		int nsp = 0;
		
		while(row <= 2*n-1)
		{
			//Work
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			if(row < n)
			{
				nst -= 1;
				nsp += 2;
			}
			else
			{
				nst += 1;
				nsp -= 2;
			}
			
			row += 1;
			System.out.println();
		}

	}

}
