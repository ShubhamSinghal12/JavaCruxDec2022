package Lec38;

public class Parent {

	int d;
	Parent(int n)
	{
		d = n;
	}
	Parent()
	{
		d = 10;
	}
	void saysHi()
	{
		System.out.println("Parent says Hi!");
	}
	
	@Override
	public String toString()
	{
		return "In Parent's toString";
	}

}
