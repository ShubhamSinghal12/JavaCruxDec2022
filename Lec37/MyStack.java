package Lec37;

public class MyStack {

	private int[] arr;
	private int top;
	
	MyStack(int n)
	{
		this.arr = new int[n];
		this.top = 0;
	}
	
	MyStack()
	{
		this(5);
	}
	
	public boolean isEmpty()
	{
		return this.top == 0;
	}
	
	public boolean isFull()
	{
		return this.top == this.arr.length;
	}
	
	public void push(int ele) throws Exception
	{
		if(this.isFull())
		{
			throw new Exception("Stack Overflow");
		}
		
		this.arr[this.top++] = ele;
	}
	
	public int pop() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("Stack Underflow");
		}
		return this.arr[--this.top];
	}
	
	public int peek() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("Stack Underflow");
		}
		return this.arr[this.top-1];
	}
	
	public int size()
	{
		return this.top;
	}
	
	public void display()
	{
		for(int i = this.top-1;i >= 0; i--)
		{
			System.out.print(this.arr[i]+" ");
		}
		System.out.println();
	}
}
