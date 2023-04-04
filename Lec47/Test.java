package Lec47;

public interface Test {
	
	int s = 10;
	int add(int a,int b);
	
	default int sub(int a,int b)
	{
		return a-b;
	}
	
	static int mul(int a,int b)
	{
		return a*b;
	}
	
	private int div(int a,int b)
	{
		return a/b;
	}

}
