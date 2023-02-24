package Lec33;

public class AxisOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ao("nitinn"));
	}
	
	public static int ao(String s)
	{
		int count = 0;
		
		//Odd
		for(int i = 0; i < s.length(); i++)
		{
			//Odd
			count += 1;
			int left = i-1;
			int right = i+1;
			while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
			{
				count += 1;
				left--;
				right++;
			}
			
			//Even
			left = i;
			right = i+1;
			while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
			{
				count += 1;
				left--;
				right++;
			}
		}
		
		//even
//		for(int i = 0; i < s.length()-1; i++)
//		{
//			int left = i;
//			int right = i+1;
//			while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
//			{
//				count += 1;
//				left--;
//				right++;
//			}
//		}
		
		return count;
		
	}

}
