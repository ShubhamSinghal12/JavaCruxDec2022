package Lec42;

public class MyLinkedList {

	private class Node{
		int data;
		Node next;
		
		Node()
		{
			this(0);
		}
		Node(int data)
		{
			this(data,null);
		}
		Node (int data ,Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head;
	
	public MyLinkedList() {
		this.head = null;
	}
	
	public boolean isEmpty()
	{
		return this.head == null;
	}
	
	public int size()
	{
		int ct = 0;
		Node temp = this.head;
		while(temp != null)
		{
			ct++;
			temp = temp.next;
		}
		return ct;
	}
	
	
	public void addFirst(int ele)
	{
		Node nn = new Node(ele,this.head);
		this.head = nn;
	}
	public void display()
	{
		Node temp = this.head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void addLast(int ele)
	{
		if(this.isEmpty())
		{
			this.addFirst(ele);
			return;
		}
		Node temp = this.head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new Node(ele);
	}
	
	
	public int getFirst()throws Exception
	{
		if(this.isEmpty())
			throw new Exception("No Data");
		return this.head.data;
	}
	
	private Node getNodeAt(int i)
	{
		// 0 <= i < size
		Node temp = this.head;
		for(int k = 0;k < i; k++)
		{
			temp = temp.next;
		}
		return temp;
	}
	
	public int getAt(int idx) throws Exception
	{
		if(idx < 0 || idx >= this.size())
			throw new Exception("Index out of Bounds");
		
		return getNodeAt(idx).data;
	}
	
	public int getLast() throws Exception
	{
		if(this.isEmpty())
			throw new Exception("No Data");
		return getNodeAt(this.size()-1).data;
	}
	
	public void addAt(int ele,int idx) throws Exception
	{
		if(idx < 0 || idx > this.size())
		{
			throw new Exception("Out of Bounds");
		}
		if(idx == 0)
		{
			this.addFirst(ele);
		}
		else
		{
			Node x = this.getNodeAt(idx-1);
			x.next = new Node(ele,x.next);
			
		}
	}
	public int removeFirst() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("No Data");
		}
		int x = this.head.data;
		this.head = this.head.next;
		return x;
	}
	
	public int removeLast() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("No Data");
		}
		int s = this.size();
		if(s == 1)
		{
			return removeFirst();
		}
		else
		{
			Node x = this.getNodeAt(s-2);
			int d = x.next.data;
			x.next = null;
			return d;
		}
	}
	
	public int removeAt(int idx) throws Exception
	{
		if(idx < 0 || idx >= this.size())
		{
			throw new Exception("Out of Bounds");
		}
		if(idx == 0)
			return removeFirst();
		Node x = this.getNodeAt(idx-1);
		int d = x.next.data;
		x.next = x.next.next;
		return d;
	}
	
	public void reverse()
	{
		Node cur = this.head;
		Node prev = null;
		
		while(cur != null)
		{
			Node ahead = cur.next;
			cur.next = prev;
			
			prev = cur;
			cur = ahead;
		}
		this.head = prev;
	}
	
	public void reverseR()
	{
		rR(null,this.head);
	}
	private void rR(Node prev,Node cur)
	{
		if(cur == null)
		{
			this.head = prev;
		}
		else
		{
			rR(cur, cur.next);
			cur.next = prev;
		}
	}
	
	public void reverseRO()
	{
		Node temp = this.head;
		rRO(this.head);
		temp.next = null;
	}
	private void rRO(Node prev)
	{
		if(prev.next == null)
		{
			this.head = prev;
		}
		else
		{
			rRO(prev.next);
			prev.next.next = prev;
		}
	}
	
	
	
	
	
	
}
