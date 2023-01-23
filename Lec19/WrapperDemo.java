package Lec19;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1000;
		Integer i2 = i;
		Integer i3 = i2;
		i3 = i;
		int i4 = Integer.parseInt("1234");
		System.out.println(i2==i3);
		System.out.println(i4);
		System.out.println(i3);
		
		int t = i2.intValue();
		int t1 = i2;
		
		System.out.println(i2==i);
		
		int[] arr = new int[5];
		int[] brr = arr;
		

	}

}
