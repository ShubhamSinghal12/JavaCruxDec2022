package Lec37;

public class MyQueue {
	
	private int[] arr;
	private int front;
	private int size;
	
	MyQueue(int n)
	{
		this.arr = new int[n];
		this.front = 0;
		this.size = 0;
	}
	
	MyQueue()
	{
		this(5);
	}
	
	
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	
	public boolean isFull()
	{
		return this.size == this.arr.length;
	}
	
	public void enqueue(int ele) throws Exception
	{
		if(this.isFull())
		{
			throw new Exception("Queue Overflow");
		}
		
		this.arr[(this.front+this.size)%this.arr.length] = ele;
		this.size++;
	}
	
	public int dequeue() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("Queue Underflow");
		}
		int x = this.arr[this.front];
		this.front = (this.front+1)%this.arr.length;
		this.size--;
		return x;
	}
	
	public int peek() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("Queue Underflow");
		}
		return this.arr[this.front];
	}
	
	public int size()
	{
		return this.size;
	}
	
	public void display()
	{
		for(int i = this.front;i < this.front+this.size; i++)
		{
			System.out.print(this.arr[i%this.arr.length]+" ");
		}
		System.out.println();
	}

}
