package Lec50;

import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashMap<String, Integer> map = new MyHashMap<>();
		map.put("India", 10000);
		map.put("USA", 1000);
		map.put("USSR", 2000);
		map.put("France", 100);
		System.out.println(map);
		
		map.put("USA", 300);
		System.out.println(map);
		System.out.println(map.get("India"));
		System.out.println(map.get("Nepal"));
//		System.out.println(map.getOrDefault("India", 1000));
		System.out.println(map.containsKey("india"));
		System.out.println(map.remove("USA"));
		System.out.println(map);
		
		
		

	}

}
