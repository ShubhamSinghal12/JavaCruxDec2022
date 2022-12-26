package Lec5;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int row = 1;
		int nst = n;
		int nsp = n-1;
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print(" ");
				csp += 1;
			}
			int cst = 1;
			while(cst <= nst)
			{
				if(row == 1 || row == n || cst ==1 || cst == n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				cst += 1;
			}
			row += 1;
			nsp -= 1;
			System.out.println();
		}

	}

}
