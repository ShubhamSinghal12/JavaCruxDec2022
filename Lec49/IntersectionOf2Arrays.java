package Lec49;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOf2Arrays {
	
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++)
        {
            set.add(nums1[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++)
        {
            if(set.contains(nums2[i]))
            {
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        
        int[] arr = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
        {
            arr[i] = ans.get(i);
        }
        return arr;
        
        
        
    }

}
