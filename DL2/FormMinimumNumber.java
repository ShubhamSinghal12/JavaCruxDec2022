package DL2;

import java.util.Arrays;

public class FormMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minNum("IDDIDI");

	}
	
	public static void minNum(String s)
	{
//		s += "I";
		int[] ans = new int[s.length()+1];
		int count = 1;
		for(int i = 0; i <= s.length(); i++)
		{
			if(i == s.length() || s.charAt(i) == 'I')
			{
				ans[i] = count;
				count++;
				int temp = i-1;
				while(temp >= 0 && s.charAt(temp) == 'D')
				{
					ans[temp] = count;
					count++;
					temp--;
				}
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
