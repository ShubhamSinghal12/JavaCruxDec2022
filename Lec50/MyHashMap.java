package Lec50;

import java.util.ArrayList;

public class MyHashMap <K,V> {

	private class Node{
		
		K key;
		V value;
		Node next;
		
		Node(K key,V val)
		{
			this.key = key;
			this.value = val;
		}
		Node()
		{
			this(null,null);
		}
	}
	
	ArrayList<Node> buckets;
	int size = 0;
	private static final int th = 2;
	
	MyHashMap(int bsize)
	{
		buckets = new ArrayList<>();
		for(int i = 0; i < bsize; i++)
		{
			buckets.add(null);
		}
	}
	
	MyHashMap()
	{
		this(5);
	}
	
	public int hash(K key)
	{
		if(key == null)
		{
			return 0;
		}
		int bn = key.hashCode()%buckets.size();
		if(bn < 0)
			bn += buckets.size();
		return bn;
	}
	
	public void put(K key,V val)
	{
		int bn = hash(key);
		Node temp = buckets.get(bn);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				temp.value = val;
				return;
			}
			else
			{
				temp = temp.next;
			}
		}
		
		Node nn = new Node(key,val);
		nn.next = buckets.get(bn);
		buckets.set(bn, nn);
		
		size++;
		
		int lf = size/buckets.size();
		if(lf >= th)
		{
			rehash();
		}
	}
	
	
	private void rehash()
	{
		ArrayList<Node> nb = new ArrayList<Node>();
		ArrayList<Node> ob = buckets;
		
		for(int i = 0; i < 2*ob.size(); i++)
		{
			nb.add(null);
		}
		
		this.buckets = nb;
		for(int i = 0; i < ob.size(); i++)
		{
			Node temp = ob.get(i);
			while(temp != null)
			{
				this.put(temp.key, temp.value);
				temp = temp.next;
			}
		}
	}
	
	public V get(K key)
	{
		int bn = hash(key);
		Node temp = this.buckets.get(bn);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				return temp.value;
			}
			else
			{
				temp = temp.next;
			}
		}
		return null;
	}
	
	public V remove(K key)
	{
		int bn = hash(key);
		Node temp = this.buckets.get(bn);
		Node prev = temp;
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				break;
			}
			else
			{
				prev = temp;
				temp = temp.next;
			}
		}
		
		if(temp == null)
			return null;
		
		if(prev == temp)
		{
			this.buckets.set(bn, prev.next);
		}
		else
		{
			prev.next = temp.next;
		}
		return temp.value;
	}
	
	public boolean containsKey(K key)
	{
		int bn = hash(key);
		Node temp = buckets.get(bn);
		while(temp != null)
		{
			if(temp.key.equals(key))
			{
				return true;
			}
			else
			{
				temp = temp.next;
			}
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		String s = "[ ";
		for(int i = 0; i < this.buckets.size(); i++)
		{
			Node temp = this.buckets.get(i);
			while(temp != null)
			{
				s += temp.key+" : "+temp.value+" ";
				temp = temp.next;
			}
		}
		s += "]";
		return s;
	}
	
	
	
	

}
