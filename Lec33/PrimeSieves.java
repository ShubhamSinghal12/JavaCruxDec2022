package Lec33;

public class PrimeSieves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeS(30);

	}
	
	public static void primeS(int n) {
		
		boolean[] ps = new boolean[n+1];
		
		for(int i = 2; i*i <= n; i++)
		{
			if(ps[i] == false)
			{
//				System.out.println(i);
				for(int j = i*i; j <= n; j += i)
				{
					ps[j] = true;
				}
			}
		}
		
		for(int i = 2; i <= n; i++)
		{
			if(ps[i] == false)
			{
				System.out.println(i);
			}
		}
		
	}

}
