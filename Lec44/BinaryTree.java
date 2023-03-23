package Lec44;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

	private static Scanner sc = new Scanner(System.in);
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
	public void createTree()
	{
		this.root = createTree(null, null);
	}
	private Node createTree(Node parent,String lr)
	{
		if(parent == null)
		{
			System.out.println("Enter the root node: ");
		}
		else
		{
			System.out.println("Enter the value of "+lr+ " child of "+parent.data+": ");
		}
		int d = sc.nextInt();
		Node n = new Node(d);
		
		System.out.println("Is there a left child of "+d+" : ");
		boolean f = sc.nextBoolean();
		if(f)
		{
			n.left = createTree(n, "left");
		}
		
		System.out.println("Is there a right child of "+d+" : ");
		f = sc.nextBoolean();
		if(f)
		{
			n.right = createTree(n, "right");
		}
		
		return n;
	}
	
	public void createTree2()
	{
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);
		Node n9 = new Node(90);
		
		this.root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n8;
		n3.right = n6;
		n5.left = n7;
		n6.right = n9;
		
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
	public int size()
	{
		return this.size(this.root);
	}
	private int size(Node r)
	{
		if(r == null)
		{
			return 0;
		}
		else
		{
			return 1+size(r.left)+size(r.right);
		}
	}
	
	public int max()
	{
		return this.max(this.root);
	}
	
	private int max(Node r)
	{
		if(r == null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			return Math.max(r.data, Math.max(max(r.left), max(r.right)));
		}
	}
	
	private int max2(Node r)
	{
		int m = r.data;
		if(r.left != null)
		{
			m = Math.max(m, max2(r.left));
		}
		if(r.right != null)
		{
			m = Math.max(m, max2(r.right));
		}
		return m;
	}
	
	public boolean find(int ele)
	{
		return this.find(this.root,ele);
	}
	private boolean find(Node r,int ele)
	{
		if(r == null)
		{
			return false;
		}
		else
		{
			return r.data == ele || find(r.left, ele) || find(r.right, ele);
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
	
	public void preorder()
	{
		this.preorder(this.root);
	}
	private void preorder(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			System.out.print(r.data+" ");
			preorder(r.left);
			preorder(r.right);
		}
	}
	
	public void inorder()
	{
		this.inorder(this.root);
	}
	private void inorder(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			inorder(r.left);
			System.out.print(r.data+" ");
			inorder(r.right);
		}
	}
	
	public void postorder()
	{
		this.postorder(this.root);
	}
	private void postorder(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data+" ");
		}
	}
	
	public void levelOrder()
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node r = qt.remove();
			System.out.print(r.data+" ");
			if(r.left != null) {
				qt.add(r.left);
			}
			if(r.right != null) {
				qt.add(r.right);
			}
		}
		System.out.println();
	}
	
	public void levelbylevelOrder()
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		int counter = 1;
		while(!qt.isEmpty())
		{
			Node r = qt.remove();
			counter--;
			System.out.print(r.data+" ");
			if(r.left != null) {
				qt.add(r.left);
			}
			if(r.right != null) {
				qt.add(r.right);
			}
			
			if(counter == 0)
			{
				System.out.println();
				counter = qt.size();
			}
		}
		System.out.println();
	}
	
	public void mirror()
	{
		mirror(root);
	}
	
	private void mirror(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			Node t = r.left;
			r.left = r.right;
			r.right = t;
			
			mirror(r.left);
			mirror(r.right);
		}
	}
	

}
