package Lec49;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	
public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        int max = 0;
        for(int val : set)
        {
            if(!set.contains(val-1))
            {
                int cl = 1;
                while(set.contains(val+1))
                {
                    cl++;
                    val++;
                }
                if(max < cl)
                    max = cl;
            }
        }
        return max;
        
    }

}
