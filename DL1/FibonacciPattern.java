package DL1;

public class FibonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		
		int row = 1;
		int nst = 1;
		int a = 0;
		int b = 1;
		
		while(row <= n)
		{
			//Work
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print(a+"\t");
				cst++;
				
				int c = a+b;
				a = b;
				b = c;
				
			}
			
			nst += 1;
			row += 1;
			System.out.println();
		}

	}

}
