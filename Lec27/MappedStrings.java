package Lec27;

public class MappedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mps("123","");
		
	}
	public static void mps(String nums,String ans)
	{
		if(nums.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = (char)(nums.charAt(0) + 16);
			mps(nums.substring(1), ans+ch);
			
			if(nums.length() >= 2)
			{
				int n = Integer.parseInt(nums.substring(0,2));
				if(n <= 26)
				{
					char c = (char)(n+64);
					mps(nums.substring(2), ans+c);
				}
			}
		}
	}

}
