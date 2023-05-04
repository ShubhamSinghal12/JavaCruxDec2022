package Lec56;

public class MatrixDotProductofSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxP(int[] nums1,int[] nums2,int i,int j)
    {
        if(i == nums1.length || j == nums2.length)
        {
            return Integer.MIN_VALUE;
        }
        int s = nums1[i]*nums2[j] + Math.max(maxP(nums1,nums2,i+1,j+1),0);
        int f = maxP(nums1,nums2,i+1,j);
        int l = maxP(nums1,nums2,i,j+1);

        return Math.max(s,Math.max(f,l));
    }
	
	public static int ansBU(int[]arr1, int[]arr2)
	{
		int[] cur = new int[arr2.length+1];
		int[] prev = new int[arr2.length+1];

        cur[arr2.length] = Integer.MIN_VALUE;

		for(int i = 0; i <= arr2.length; i++)
		{
			prev[i] = Integer.MIN_VALUE;
		}
		
		for(int i = arr1.length - 1; i >= 0; i--)
		{
			for(int j = arr2.length - 1; j >= 0; j--)
			{
				int p = arr1[i] * arr2[j] + Math.max(prev[j + 1], 0);
				int f = prev[j];
				int s = cur[j + 1];
				cur[j] =  Math.max(p, Math.max(f, s));
			}
            int[] t = prev;
            prev = cur;
            cur = t;

		}
		return prev[0];
	}


	
	

}
