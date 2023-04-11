package Lec50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class GroupAnaGrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = {"eat","tea","tan","ate","nat","bat"};
		
		HashMap<String,ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(int i = 0; i < s.length; i++)
		{
			char c[] = s[i].toCharArray();
			Arrays.sort(c);
			String si = String.valueOf(c);
//			String si = Arrays.toString(c);
			if(map.containsKey(si))
			{
				map.get(si).add(s[i]);
			}
			else
			{
				map.put(si, new ArrayList<String>(Arrays.asList(s[i])));
			}
		}
		
		Set<String> keys = map.keySet();
		for(String val:keys)
		{
			System.out.println(val+" "+map.get(val));
		}
		

	}

}

