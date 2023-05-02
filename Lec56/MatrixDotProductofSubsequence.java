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

}
