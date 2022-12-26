package DL1;

public class InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int nst = 2*n+1;
		int row = 1;
		int p = 1;
		while(row <= 2*n+1)
		{
			int cst = 1;
			int cval = n;
			while(cst <= nst)
			{
				if(cst <= p || cst > nst-p)
				{
					System.out.print(cval+" ");
				}
				else
				{
					System.out.print("  ");
				}
				if(cst <= nst/2)
					cval -= 1;
				else
					cval += 1;
				cst++;
			}
			if(row <= n)
				p++;
			else
				p--;
			row++;
			System.out.println();
		}

	}

}
