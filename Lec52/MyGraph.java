package Lec52;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyGraph {
	
	HashMap<Integer,HashMap<Integer,Integer>> map;
	
	
	MyGraph()
	{
		this(0);
	}
	MyGraph(int n)
	{
		map = new HashMap<>();
		for(int i = 1; i <= n; i++)
		{
			map.put(i,new HashMap<>());
		}
	}
	
	public void addVertex(int v)
	{
		map.put(v, new HashMap<>());
	}
	public void addEdge(int u,int v,int cost)
	{
		map.get(u).put(v, cost);
		map.get(v).put(u, cost);
	}
	
	public boolean containsVertex(int v)
	{
		return map.containsKey(v);
	}
	public boolean containsEdge(int u,int v)
	{
		return map.get(u).containsKey(v) && map.get(v).containsKey(u);
	}
	
	public int noOfVertex()
	{
		return map.size();
	}
	public int noOfEdges()
	{
		int ct = 0;
		for(int u: map.keySet())
		{
			ct += map.get(u).size();
		}
		return ct/2;
	}
	
	public void removeEdge(int u,int v)
	{
		map.get(u).remove(v);
		map.get(v).remove(u);
	}
	
	public void removeVertex(int v)
	{
		for(int u:map.get(v).keySet())
		{
			map.get(u).remove(v);
		}
		map.remove(v);
	}
	
	public void display()
	{
		for(int v: map.keySet())
		{
			System.out.println(v+" : "+map.get(v));
		}
	}
	
	public boolean hasPath(int u,int v)
	{
		return hP(u, v, new HashSet<>());
	}
	
	private boolean hP(int u,int v, HashSet<Integer> visited)
	{
		if(u == v)
		{
			return true;
		}
		
		visited.add(u);
		boolean ans = false;
		for(int nbbrs : map.get(u).keySet())
		{
			if(!visited.contains(nbbrs))
			{
				ans = ans || hP(nbbrs,v,visited);
			}
		}
		visited.remove(u);
		return ans;
	}
	
	
	
	public void printAllPaths(int u,int v)
	{
		pap(u, v, new HashSet<>(),u+"");
	}
	
	private void pap(int u,int v, HashSet<Integer> visited,String ans)
	{
		if(u == v)
		{
			System.out.println(ans);
			return;
		}
		
		visited.add(u);
		for(int nbbrs : map.get(u).keySet())
		{
			if(!visited.contains(nbbrs))
			{
				pap(nbbrs,v,visited,ans+" - "+nbbrs);
			}
		}
		visited.remove(u);
	}
	
	public boolean hasPathBFS(int u,int v)
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		qt.add(u);
		while(!qt.isEmpty())
		{
			int n = qt.remove();
			if(n == v)
				return true;
			
			if(visited.contains(n))
			{
				continue;
			}
			visited.add(n);
			for(int nbbrs:map.get(n).keySet())
			{
				if(!visited.contains(nbbrs))
				{
					qt.add(nbbrs);
				}
			}
		}
		return false;
	}
	
	
	
	public void BFST()
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int u: map.keySet())
		{
			if(!visited.contains(u))
			{
				qt.add(u);
			}
			while(!qt.isEmpty())
			{
				int n = qt.remove();
				
				if(visited.contains(n))
				{
					continue;
				}
				System.out.println(n);
				visited.add(n);
				for(int nbbrs:map.get(n).keySet())
				{
					if(!visited.contains(nbbrs))
					{
						qt.add(nbbrs);
					}
				}
			}
		}
		
	}
	
	
	public void DFST()
	{
		Stack<Integer> qt = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int u: map.keySet())
		{
			if(!visited.contains(u))
			{
				qt.push(u);
			}
			while(!qt.isEmpty())
			{
				int n = qt.pop();
				
				if(visited.contains(n))
				{
					continue;
				}
				System.out.println(n);
				visited.add(n);
				for(int nbbrs:map.get(n).keySet())
				{
					if(!visited.contains(nbbrs))
					{
						qt.push(nbbrs);
					}
				}
			}
		}
		
	}
	
	
	public boolean isCycle()
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int u: map.keySet())
		{
			if(!visited.contains(u))
			{
				qt.add(u);
			}
			while(!qt.isEmpty())
			{
				int n = qt.remove();
				
				if(visited.contains(n))
				{
					return true;
				}
//				System.out.println(n);
				visited.add(n);
				for(int nbbrs:map.get(n).keySet())
				{
					if(!visited.contains(nbbrs))
					{
						qt.add(nbbrs);
					}
				}
			}
		}
		return false;
	}
	
	
	public int noOfConnectedComponents()
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for(int u: map.keySet())
		{
			if(!visited.contains(u))
			{
				qt.add(u);
				count++;
			}
			while(!qt.isEmpty())
			{
				int n = qt.remove();
				
				if(visited.contains(n))
				{
					continue;
				}
//				System.out.println(n);
				visited.add(n);
				for(int nbbrs:map.get(n).keySet())
				{
					if(!visited.contains(nbbrs))
					{
						qt.add(nbbrs);
					}
				}
			}
		}
		return count;
		
	}
	
	public void printAllComponents()
	{
		Queue<Integer> qt = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		ArrayList<Integer> ans;
		for(int u: map.keySet())
		{
			if(!visited.contains(u))
			{
				ans = new ArrayList<>();
				qt.add(u);
				count++;
				while(!qt.isEmpty())
				{
					int n = qt.remove();
					
					if(visited.contains(n))
					{
						continue;
					}
	//				System.out.println(n);
					visited.add(n);
					ans.add(n);
					for(int nbbrs:map.get(n).keySet())
					{
						if(!visited.contains(nbbrs))
						{
							qt.add(nbbrs);
						}
					}
				}
				System.out.println(ans);
			}
		}
		
	}
	
	
	
	
}
