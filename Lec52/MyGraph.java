package Lec52;

import java.util.HashMap;
import java.util.HashSet;

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
	

}
