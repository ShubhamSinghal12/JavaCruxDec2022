package Lec58;

public class NiceSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public int numberOfSubarrays(int[] nums, int k) {
        
        return atmostK(nums,k) - atmostK(nums,k-1);
    }
    public int atmostK(int[] nums,int k)
    {
        int start = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if((nums[i]&1) == 1)
            {
                k--;
            }
            while(k < 0)
            {
                if((nums[start]&1) == 1)
                {
                    k++;
                }
                start++;
            }
            ans += i-start+1;
            
        }
        return ans;
    }

}
