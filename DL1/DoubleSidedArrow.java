package DL1;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		
		int nsp1 = n-1;
		int nsp2 = -1;
		int nst = 1;
		int row = 1;
		int val = 1;
		
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp1)
			{
				System.out.print("  ");
				csp++;
			}
			
			int cst = 1;
			int cval = val;
			while(cst <= nst)
			{
				System.out.print(cval+" ");
				cst++;
				cval--;
			}
			
			csp = 1;
			while(csp <= nsp2)
			{
				System.out.print("  ");
				csp++;
			}
			
			cst = 1;
			cval = 1;
			if(row == 1 || row == n)
				cst = 2;
			while(cst<= nst)
			{
				System.out.print(cval +" ");
				cst++;
				cval++;
			}
			
			if(row <= n/2)
			{
				nsp1 -= 2;
				nst += 1;
				nsp2 += 2;
				val += 1;
			}
			else
			{
				nsp1 += 2;
				nst -= 1;
				nsp2 -= 2;
				val -= 1;
			}
			
			row++;
			System.out.println();
			
			
			
		}

	}

}
