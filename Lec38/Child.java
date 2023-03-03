package Lec38;

public class Child extends Parent{

	int d2 = 20;
	int d = 100;
	
	Child()
	{
		this(50);
	}
	Child(int n)
	{
		super(n);
//		d = n;
	}
	
	void saysHi()
	{
		System.out.println("Child says Hi!");
//		System.out.println(super.d);
//		super.saysHi();
	}

}
