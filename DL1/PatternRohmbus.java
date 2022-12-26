package DL1;

public class PatternRohmbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		int val = 1;
		while(row <= 2*n-1)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print(" \t");
				csp += 1;
			}
			
			int cst = 1;
			int cval = val;
			while(cst <= nst)
			{
				System.out.print(cval+"\t");
				if(cst <= nst/2)
				{
					cval++;
				}
				else
				{
					cval--;
				}
				cst++;
			}
			
			if(row < n)
			{
				nsp --;
				nst += 2;
				val++;
			}
			else
			{
				nsp++;
				nst -= 2;
				val--;
			}
			row++;
			System.out.println();
		}
	}

}
