package Lec46;

public class BinarySearchTree {
	
	private class Node{
		int data;
		Node left,right;
		
		Node()
		{
			this(0);
		}
		Node(int data)
		{
			this(data,null,null);
		}
		Node(int data,Node left,Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	private Node root;
	
	public void createTree(int[] in)
	{
		this.root = cT(in,0,in.length-1);
	}
	private Node cT(int[] in,int si,int ei)
	{
		if(si>ei)
		{
			return null;
		}
		else
		{
			int mid = (si+ei)/2;
			Node n = new Node(in[mid]);
			n.left = cT(in, si,mid-1);
			n.right = cT(in, mid+1, ei);
			return n;
		}
	}
	
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node r)
	{
		if(r == null)
		{
			return;
		}
		String s = "";
		if(r.left!= null)
		{
			s += r.left.data; 
		}
		s += " -> "+r.data+" <- ";
		if(r.right != null)
		{
			s += r.right.data;
		}
		System.out.println(s);
		display(r.left);
		display(r.right);
		
	}
	
	public boolean find(int ele)
	{
		return find(root,ele);
	}
	private boolean find(Node r,int ele)
	{
		if(r == null)
			return false;
		else
		{
			if(r.data == ele)
			{
				return true;
			}
			else if(r.data > ele)
			{
				return find(r.left,ele);
			}
			else
			{
				return find(r.right, ele);
			}
		}
	}
	public int max()
	{
		Node r = root;
		while(r.right!=null)
			r = r.right;
		return r.data;
	}
	private int max(Node r)
	{
		if(r.right == null)
		{
			return r.data;
		}
		else
		{
			return max(r.right);
		}
	}
	
	public int ht()
	{
		return this.ht(this.root);
	}
	private int ht(Node r)
	{
		if(r == null)
		{
			return -1;
		}
		else
		{
			return 1+Math.max(ht(r.left),ht(r.right));
		}
	}
	
	
	public void add(int ele)
	{
		add(this.root,ele);
	}
	private void add(Node r,int ele)
	{
		if(r == null)
		{
			this.root = new Node(ele);
			return;
		}
		else if(r.data > ele)
		{
			if(r.left == null)
			{
				r.left = new Node(ele);
				return;
			}
			else
			{
				add(r.left, ele);
			}
		}
		else
		{
			if(r.right == null)
			{
				r.right = new Node(ele);
				return;
			}
			else
			{
				add(r.right, ele);
			}
		}
	}
	
	public void add2(int ele)
	{
		this.root = add2(this.root,ele);
	}
	private Node add2(Node r,int ele)
	{
		if(r == null)
		{
			return new Node(ele);
		}
		else
		{
			if(r.data > ele)
			{
				r.left = add2(r.left,ele);
			}
			else
			{
				r.right = add2(r.right,ele);
			}
			return r;
		}
		
	}
	
	
	public void delete(int ele)
	{
		this.root = delete(root, ele);
	}
	
	private Node delete(Node r,int ele)
	{
		if(r == null)
		{
			return null;
		}
		else if(r.data > ele)
		{
			r.left = delete(r.left, ele);
		}
		else if(r.data < ele)
		{
			r.right = delete(r.right, ele);
		}
		else
		{
			if(r.left == null && r.right == null)
			{
				return null;
			}
			else if(r.right == null)
			{
				return r.left;
			}
			else if(r.left == null)
			{
				return r.right;
			}
			else
			{
				int d = max(r.left);
				r.data = d;
				r.left = delete(r.left, d);
			}
		}
		return r;
	}
	
	
	
	

}
