package Lec6;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		int val = 1;
		
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
			int cval = val;
			while(cst <= nst)
			{
				System.out.print(cval+" ");
				if(cst <= nst/2)
					cval+=1;
				else
					cval-=1;
				cst += 1;
			}
			
			nsp -= 1;
			nst += 2;
			val += 1;
			row += 1;
			
			System.out.println();
		}
		
	}

}
