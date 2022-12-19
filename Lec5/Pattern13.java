package Lec5;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nst = 1;
		
		while(row <= 2*n-1)
		{
			//Work
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst++;
			}
			
			if(row < n)
				nst += 1;
			else
				nst -= 1;
			row += 1;
			System.out.println();
		}

	}

}
