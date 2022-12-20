package Lec6;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		
		int row = 1;
		int nsp = -1;
		int nst = n/2+1;
		
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst ++;
			}
			
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			
			cst = 1;
			if(row == 1 || row == n)
				cst = 2;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst ++;
			}
			
			if(row <= n/2)
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
