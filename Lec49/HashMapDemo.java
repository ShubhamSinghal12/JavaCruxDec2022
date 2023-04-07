package Lec49;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 10000);
		map.put("USA", 1000);
		map.put("USSR", 2000);
		map.put("France", 100);
		System.out.println(map);
		
		map.put("USA", 300);
		System.out.println(map);
		System.out.println(map.get("India"));
		System.out.println(map.get("Nepal"));
		System.out.println(map.getOrDefault("India", 1000));
		System.out.println(map.containsKey("india"));
		System.out.println(map.remove("USAA"));
		System.out.println(map);
		
		Set<String> set = map.keySet();
		for(String val:set) {
			System.out.println(val+" : "+ map.get(val));
		}
		System.out.println("-------------------------------");
		ArrayList<String> al = new ArrayList<>(map.keySet());
		Collections.sort(al);
		for(String val:al) {
			System.out.println(val+" : "+ map.get(val));
		}
		
		System.out.println("---------------------------------");
		for(Map.Entry<String, Integer> val :map.entrySet())
		{
			System.out.println(val.getKey() +" : "+ val.getValue());
		}
		
		System.out.println("---------------------------------");
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
		lmap.put("India", 10000);
		lmap.put("USA", 1000);
		lmap.put("USSR", 2000);
		lmap.put("France", 100);
		System.out.println(lmap);
		
		
		System.out.println("---------------------------------");
		TreeMap<String, Integer> tmap = new TreeMap<>();
		tmap.put("India", 10000);
		tmap.put("USA", 1000);
		tmap.put("USSR", 2000);
		tmap.put("France", 100);
		System.out.println(tmap);

	}

}
