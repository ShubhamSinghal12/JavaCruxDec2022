package Lec42;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MyLinkedList ll = new MyLinkedList();
//		for(int i = 5;i >= 1; i--)
//		{
//			ll.addLast(i);
//		}
//		ll.addAt(10, 2);
//		ll.removeAt(ll.size()-1);
//		ll.display();
//		ll.reverseRO();
//		ll.display();
		
		for(int i = 1; i <= 8; i++)
		{
			ll.addLast(i);
		}
		ll.display();
		ll.kreverse(3);
		ll.display();
		
	}

}
