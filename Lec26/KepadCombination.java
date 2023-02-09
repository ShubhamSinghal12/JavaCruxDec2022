package Lec26;

import java.util.ArrayList;

public class KepadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] code = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		ArrayList<String> ans = new ArrayList<>();
		kpc("23","",code,ans);
		System.out.println(ans);
		
	}
	
	public static void kpc(String nums,String ans,String[] code,ArrayList<String> ra)
	{
		if(nums.length() == 0)
		{
			ra.add(ans);
		}
		else
		{
			String c = code[nums.charAt(0)-'0'];
			for(int i = 0; i < c.length(); i++)
			{
				kpc(nums.substring(1),ans+c.charAt(i),code,ra);
			}
			
			
		}
	}
	
	
	
	
}
