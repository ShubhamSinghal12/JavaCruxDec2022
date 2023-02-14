package Lec29;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,2,5};
//		ccc(coins, 5, "",0);
		cccr(coins, 0, 5, "");

	}
	
	public static void ccp(int[] coins,int target,String ans)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < coins.length; i++)
			{
				if(target >= coins[i])
				{
					ccp(coins,target-coins[i],ans+coins[i]);
				}
			}
		}
	}
	
	
	public static void ccc(int[] coins,int target,String ans,int lastPlace)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = lastPlace; i < coins.length; i++)
			{
				if(target >= coins[i])
				{
					target = target-coins[i];
					ccc(coins,target,ans+coins[i],i);
					target = target+coins[i];
				}
			}
		}
	}
	
	public static void cccr(int[] coins,int i,int target,String ans)
	{
		if(target == 0)
		{
			System.out.println(ans);
		}
		else if(i >= coins.length || target < 0)
		{
			return;
		}
		else
		{
			//Place
			cccr(coins, i, target-coins[i], ans+coins[i]);
			
			//Not Place
			cccr(coins, i+1, target, ans);
		}
	}
	
	
	
	
	
	
	
	
	
}
