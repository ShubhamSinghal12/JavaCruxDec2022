package Lec6;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		
		int row = 1;
		int nst = 1;
		int nsp = n/2;
		
		while(row <= n)
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
				if(cst == 1 || cst == nst)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				cst++;
			}
			
			if(row < n/2+1)
			{
				nst += 2;
				nsp -= 1;
			}
			else
			{
				nst -= 2;
				nsp += 1;
			}
			
			row += 1;
			System.out.println();
		}

	}

}
