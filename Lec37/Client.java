package Lec37;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
//		MyStack st = new MyStack();
//		for(int i = 1; i <= 5; i++)
//			st.push(i);
//		st.display();
//		System.out.println(st.peek());
//		st.display();
		
		MyQueue qt = new MyQueue();
		
		for(int i = 1; i <= 4; i++)
		{
			qt.enqueue(i);
		}
		qt.display();
		System.out.println(qt.dequeue());
		System.out.println(qt.dequeue());
		qt.display();
		qt.enqueue(5);
		qt.display();
		qt.enqueue(6);
		qt.display();
		qt.enqueue(7);
		qt.display();
		System.out.println(qt.dequeue());
		System.out.println(qt.dequeue());
		qt.display();
//		qt.enqueue(8);
//		qt.display();
		
	}

}
