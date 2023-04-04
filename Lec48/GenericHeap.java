package Lec48;

import java.util.ArrayList;

public class GenericHeap <T extends Comparable<T>> {

	ArrayList<T> heap = new ArrayList<>();
	
	
	public int size()
	{
		return heap.size();
	}
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	
	public void add(T ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void upheapify(int ci)
	{
		int pi = (ci-1)/2;
		if(heap.get(pi).compareTo(heap.get(ci))> 0)
		{
			swap(ci,pi);
			upheapify(pi);
		}
		
	}
	
	private void swap(int a,int b)
	{
		T t = heap.get(a);
		heap.set(a,heap.get(b));
		heap.set(b, t);
	}
	
	public T getMin()
	{
		return heap.get(0);
	}
	
	public void display() {
		
		System.out.println(heap);
		
	}
	
	public T remove()
	{
		T x = heap.get(0);
		swap(0,heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		return x;
	}
	private void downheapify(int pi)
	{
		int min = pi;
		int ci = 2*pi+1;
		
		if(ci < heap.size() && heap.get(min).compareTo(heap.get(ci)) > 0)
		{
			min = ci;
		}
		ci += 1;
		if(ci < heap.size() && heap.get(min).compareTo(heap.get(ci)) > 0)
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
