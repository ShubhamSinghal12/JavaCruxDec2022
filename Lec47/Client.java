package Lec47;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test a = new Test();
//		Demo d = new Demo();
		Test d = new Demo();
		System.out.println(d.add(10, 20));
		System.out.println(d.sub(10, 20));
		System.out.println(Test.mul(10, 20));
		
		//Anonymous Class
		Test4 nt = new Test4(){

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
		};
		System.out.println(nt.add(100, 200));
	}

}
