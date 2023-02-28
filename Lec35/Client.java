package Lec35;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("Shubham",27);
		Student s2 = new Student();
		
		System.out.println(s.name+" "+s.age);
		System.out.println(s2.name+" "+s2.age);
		
		
//		s.age = 10;
//		s.name = "Shubham";
//		s2.name = "prakhar";
//		s2.name = "Prince";
		
//		s.saysHi();
//		s2.saysHi();
//		test3(s, s2);
//		s.saysHi();
//		s2.saysHi();
//		s.saysHi(12);
		
		s.saysHi("nikhil");
		
	}
	
	
	public static void test1(Student s1,Student s2)
	{
		Student t = s1;
		s1 = s2;
		s2 = t;
	}
	
	public static void test2(Student s1,Student s2)
	{
		String t = s1.name;
		s1.name = s2.name;
		s2.name = t;
	}
	
	public static void test3(Student s1,Student s2)
	{
		s1 = new Student();
		String t = s1.name;
		s1.name = s2.name;
		s2.name = t;
	}
	
	
	

}
