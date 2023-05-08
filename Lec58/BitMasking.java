package Lec58;

public class BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = -5;
//		int b = 22;
//		int b = -5;
//		System.out.println(a|b);

//		for(int i = 1; i <= 100; i++)
//		{
//			System.out.println(i + " " + (a>>i));
////			b = b>>1;
////			System.out.println(b);
//		}
		
//		System.out.println(-5/2);
//		System.out.println(countSetBits(-1));
		System.out.println(3^2);
	}
	
	public static boolean checkIthSetbit(int a,int i)
	{
		int mask = 1<<(i-1);
		
		return (a & mask) != 0;
	}
	public static int countSetBits(int a)
	{
//		int count = 0;
//		while(a!=0)
//		{
//			count += a&1;
//			a >>= 1;
//		}
//		return count;
		
		int count = 0;
		while(a!=0)
		{
			count++;
			a = a&(a-1);
		}
		return count;
	}
	
    public int[] singleNumber(int[] nums) {
        
        int a = 0;
        for(int i = 0;i < nums.length; i++)
        {
            a ^= nums[i];
        }
        int i = 0;
        while((a&1) == 0)
        {
            i++;
            a >>= 1;
        }
        int mask = 1 << i;
        int one =0, zero = 0;
        for(i = 0; i < nums.length; i++)
        {
            if((nums[i] & mask) != 0)
            {
                one ^= nums[i];
            }
            else
            {
                zero ^= nums[i];
            }
        }
        
        return new int[]{one,zero};
    }
}
