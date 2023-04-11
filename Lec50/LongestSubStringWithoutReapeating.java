package Lec50;

import java.util.HashSet;

public class LongestSubStringWithoutReapeating {

	 public int lengthOfLongestSubstring(String s) {
	        
	        HashSet<Character> set = new HashSet<>();
	        int j = 0;
	        int max = 0;
	        for(int i = 0; i < s.length(); i++)
	        {
	            if(!set.contains(s.charAt(i)))
	            {
	                set.add(s.charAt(i));
	                
	            }
	            else
	            {
	                max = Math.max(max,i-j);
	                while(s.charAt(j) != s.charAt(i))
	                {
	                    set.remove(s.charAt(j));
	                    j++;
	                }
	                j++;
	            }
	        }
	        
	        max = Math.max(max,s.length()-j);
	        
	        return max;
	        
	        
	    }
}
