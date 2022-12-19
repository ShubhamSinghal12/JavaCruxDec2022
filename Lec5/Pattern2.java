package Lec5;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		
		int row = 1;
		int nst = n;
		
		while(row <= n)
		{
			//Work
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			nst -= 1;
			row += 1;
			System.out.println();
		}

	}

}
