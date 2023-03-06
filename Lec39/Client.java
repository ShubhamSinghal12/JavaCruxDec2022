package Lec39;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Test t = new Test();
//		System.out.println(t.d);
//		
		DynamicQueue ds = new DynamicQueue();
		for(int i = 1; i <= 15; i++)
		{
			ds.enqueue(i);
			ds.display();
		}
		
	}
	
	
	
	

}
