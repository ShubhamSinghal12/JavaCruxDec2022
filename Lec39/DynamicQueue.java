package Lec39;

import Lec37.MyQueue;

public class DynamicQueue extends MyQueue{
	
	public DynamicQueue() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public DynamicQueue(int n) {
		// TODO Auto-generated constructor stub
		super(n);
	}
	
	@Override
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			int[] na = new int[arr.length*2];
			for(int i = front,k = 0; i < front+size; i++,k++)
			{
				na[k] = arr[i%arr.length];
			}
			this.arr = na;
			this.front = 0;
		}
		
		super.enqueue(ele);
		
	}

}
