package Lec36;

public class Client {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Student s = new Student("Hitesh",23);
//		s.name = "Hitesh";
//		s.age = -23;
		
//		s.setName("Hitesh");
		s.introduce();
		try {
			int a = 0;
			int b = 1/a;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(s.getName()+" "+s.getAge());
		
	}

}
