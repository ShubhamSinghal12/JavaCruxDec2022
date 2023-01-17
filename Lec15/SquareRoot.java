package Lec15;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 35;
		
		int i = 1;
		while(i*i <= n)
		{
			i++;
		}
		System.out.println(i-1);
		binaryS(n,5);

	}
	
	public static boolean isItPossible(int i,int n,int k)
	{
		return Math.pow(i, k) <= n;
	}
	
	public static void binaryS(int n,int k)
	{
		int si = 1;
		int ei = n;
		int ans = -1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(mid, n,k))
			{
				ans = mid;
				si = mid+1;
			}
			else
			{
				ei = mid-1;
			}
		}
		System.out.println(ans);
	}
	

}
