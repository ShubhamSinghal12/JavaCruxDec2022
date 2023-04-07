package Lec49;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FrequencyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dfgadsfasfdgdasftdhfgfdgsd";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++)
		{
//			if(map.containsKey(s.charAt(i)))
//			{
//				map.put(s.charAt(i), map.get(s.charAt(i))+1);
//			}
//			else
//			{
//				map.put(s.charAt(i), 0 + 1);
//			}
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		}
		ArrayList<Character> al = new ArrayList<>(map.keySet());
//		Collections.sort(al);
		for(Character val:al) {
			System.out.println(val+" : "+ map.get(val));
		}
		

	}

}
