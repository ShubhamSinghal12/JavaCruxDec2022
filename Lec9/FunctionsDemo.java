package Lec9;

public class FunctionsDemo {
	
	static int val = 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 1000;
		System.out.println(val);
		FunctionsDemo.val = 10;
		System.out.println(val);
		
		addition();
		System.out.println(FunctionsDemo.val);
//		int a = 10;
//		System.out.println(addition());
//		System.out.println(c);
//		System.out.println("a = "+a);
//		subtraction();
		
		
	}
	
	public static void subtraction()
	{
		int a = 10;
		int b = 20;
		int c = a-b;
//		addition();
		System.out.println(c);
	}
	
	public static int addition()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(val);
		val = 100;
		
		return c;
	}
	

}
