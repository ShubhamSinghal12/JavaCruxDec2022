package Lec48;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyLinkedList<Integer> ll = new MyLinkedList<>();
//		ll.addFirst(1);
//		ll.addFirst(2);
//		ll.addFirst(3);
//		ll.display();
//		
//		MyLinkedList<String> l = new MyLinkedList<>();
//		l.addFirst("abc");
//		l.addFirst("def");
//		l.addFirst("ghi");
//		l.display();
		
		
		
//		GenericHeap<Integer> hp = new GenericHeap<>();
//		for(int i = 10;i >= 1; i--)
//		{
//			hp.add(i);
//			hp.display();
//		}
//		
//		System.out.println(hp.remove());
//		hp.display();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
//		pq.add(20);
//		pq.add(10);
//		pq.add(30);
//		pq.add(40);
		
		for(int i = 10;i >= 1; i--)
		{
			pq.add(i);
			System.out.println(pq);
		}
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
		
		Collections.reverseOrder();
	}

}
