package Lec35;

public class Student {
	
	//Data Members
	String name = "abc";
	int age = 100;
	
	//Constructors
	Student()
	{
		this("xyz",10);
//		System.out.println("In default");
//		int a = 10;
	}
	
	Student(String name,int age)
	{
//		this();
		this.name = name;
		this.age = age;
	}
	
	//Data Functions
	void saysHi()
	{
		System.out.println(this.name+" SaysHi");
	}
	
	void saysHi(String name)
	{
		System.out.println(this.name+" says hi to "+name);
	}
	
}
