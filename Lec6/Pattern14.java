package Lec6;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		
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
				nst += 1;
				nsp -= 1;
			}
			else
			{
				nst -= 1;
				nsp += 1;
			}
			
			row += 1;
			System.out.println();
		}

	}

}
