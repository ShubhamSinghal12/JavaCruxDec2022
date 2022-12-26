package DL1;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		
		int row = 0;
		int nst = 1;
		
		while(row < n)
		{
			//Work
			int cst = 1;
			int cval = 1;
			while(cst <= nst)
			{
				System.out.print(cval+" ");
				cval = ((row-cst+1)*cval/cst);
				cst++;
			}
			
			nst += 1;
			row += 1;
			System.out.println();
		}

	}

}
