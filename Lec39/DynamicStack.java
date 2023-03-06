package Lec39;

import Lec37.MyStack;

public class DynamicStack extends MyStack{

	DynamicStack(int n) {
		super(n);
	}
	
	DynamicStack()
	{
		super();
	}
	
	@Override
	public void push(int ele)
	{	
		
		if(isFull())
		{
			int[] na = new int[arr.length*2];
			for(int i = 0; i < arr.length; i++)
			{
				na[i] = arr[i];
			}
			this.arr = na;
		}
		
		this.arr[this.top++] = ele;
	}
	
	

}
