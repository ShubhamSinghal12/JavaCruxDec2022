package Lec28;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 51;
		int m = 9;
		System.out.println(mazePath(0, 0, m-1, n-1, ""));
		
	}
	
	public static int mazePath(int i,int j,int m,int n,String ans)
	{
		if(i == m && j == n)
		{
//			System.out.println(ans);
			return 1;
		}
//		else if( i > m || j > n)
//		{
//			return 0;
//		}
		else
		{
			int count = 0;
			if(j < n)
				count += mazePath(i, j+1, m, n, ans+"H");
			if(i < m)
				count += mazePath(i+1, j, m, n, ans+"V");
			return count;
		}
	}

}
