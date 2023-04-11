package Lec50;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {
	
	public String reorganizeString(String s) {
		
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return map.get(o2) - map.get(o1);
			}
		});
        
        pq.addAll(map.keySet());
        
        StringBuilder sb = new StringBuilder();
        while(pq.size() > 1)
        {
        	char a = pq.remove();
        	char b = pq.remove();
        	
        	sb.append(a);
        	sb.append(b);
        	
        	map.put(a, map.get(a)-1);
        	map.put(b, map.get(b)-1);
        	
        	if(map.get(a) > 0)
        	{
        		pq.add(a);
        	}
        	if(map.get(b) > 0)
        	{
        		pq.add(b);
        	}
        }
        
        if(pq.size() > 0)
        {
        	char ch = pq.remove();
        	if(map.get(ch) > 1)
        	{
        		return "";
        	}
        	else
        	{
        		sb.append(ch);
        	}
        }
        return sb.toString();
    }

}
