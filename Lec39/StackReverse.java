package Lec39;

public class StackReverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack st = new DynamicStack();
		for(int i = 1; i <= 5; i++)
			st.push(i);
		
		st.display();
//		displayReverse(st);
		ar2(st);
//		System.out.println();
		st.display();

	}
	
	public static void displayReverse(DynamicStack st) throws Exception
	{
		DynamicStack nst = new DynamicStack();
		while(!st.isEmpty())
		{
			nst.push(st.pop());
		}
		nst.display();
		while(!nst.isEmpty())
		{
			st.push(nst.pop());
		}
	}
	public static void dRR(DynamicStack st)throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int n = st.pop();
			dRR(st);
			System.out.print(n+" ");
			st.push(n);
		}
	}
	
	public static void ar(DynamicStack st) throws Exception
	{
		DynamicStack nst = new DynamicStack();
		arHelper(st, nst);
		
		while(!nst.isEmpty())
		{
			st.push(nst.pop());
		}
	}
	public static void arHelper(DynamicStack st,DynamicStack nst)throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int n = st.pop();
			arHelper(st, nst);
			nst.push(n);
		}
	}
	
	public static void ar2(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int x = st.pop();
			ar2(st);
			addFirst(st, x);
		}
	}
	
	public static void addFirst(DynamicStack st,int n) throws Exception
	{
		if(st.isEmpty())
		{
			st.push(n);
		}
		else
		{
			int x = st.pop();
			addFirst(st, n);
			st.push(x);
//			addFirst(st, x);
		}
	}
	
	

}
