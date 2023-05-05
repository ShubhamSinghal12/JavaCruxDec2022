package Lec57;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {2,4,6,2,5};
		System.out.println(wp(p, 0, p.length-1));

	}
	
	
	public static int wp(int[] profit,int si,int ei,int y)
	{
		if(si > ei)
		{
			return 0;
		}
		else
		{
			int f = y*profit[si]+wp(profit, si+1, ei, y+1);
			int l = y*profit[ei]+wp(profit, si, ei-1, y+1);
			
			return Math.max(f, l);
		}
	}
	
	public static int wp(int[] profit,int si,int ei)
	{
		if(si > ei)
		{
			return 0;
		}
		else
		{
			int y = profit.length-(ei-si);
			int f = y*profit[si]+wp(profit, si+1, ei);
			int l = y*profit[ei]+wp(profit, si, ei-1);
			
			return Math.max(f, l);
		}
	}

}
