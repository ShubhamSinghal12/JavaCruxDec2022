package Lec48;

import java.util.ArrayList;

public class MyHeap {
	
	ArrayList<Integer> heap = new ArrayList<>();
	
	
	public int size()
	{
		return heap.size();
	}
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	public void add(int ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void upheapify(int ci)
	{
		int pi = (ci-1)/2;
		if(heap.get(pi) > heap.get(ci))
		{
			swap(ci,pi);
			upheapify(pi);
		}
		
	}
	
	private void swap(int a,int b)
	{
		int t = heap.get(a);
		heap.set(a,heap.get(b));
		heap.set(b, t);
	}
	
	public int getMin()
	{
		return heap.get(0);
	}
	
	public void display() {
		
		System.out.println(heap);
		
	}
	
	public int remove()
	{
		int x = heap.get(0);
		swap(0,heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		return x;
	}
	private void downheapify(int pi)
	{
		int min = pi;
		int ci = 2*pi+1;
		
		if(ci < heap.size() && heap.get(ci) < heap.get(min))
		{
			min = ci;
		}
		ci += 1;
		if(ci < heap.size() && heap.get(ci) < heap.get(min))
		{
			min = ci;
		}
		
		if(min != pi)
		{
			swap(min,pi);
			downheapify(min);
		}
	}

}
