package Lec52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
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
//		map.get(v).put(u, cost);
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
	
	
	public boolean isTree()
	{
		return !isCycle() && noOfConnectedComponents() == 1;
	}
	
	public boolean isConnected()
	{
		return noOfConnectedComponents() == 1;
	}
	
	
	private class DisjointSets{
		
		private class Node{
			int data;
			Node parent;
			int rank;
			
			Node(int data,int rank)
			{
				this.data = data;
				this.rank = rank;
//				this.parent = this;
			}
		}
		
		HashMap<Integer,Node> ds = new HashMap<>();
		
		public void createSet(int v)
		{
			Node n = new Node(v,0);
			n.parent = n;
			ds.put(v, n);
		}
		
		public int find(int v)
		{
			return find(ds.get(v)).data;
		}
		private Node find(Node v)
		{
			if(v.parent == v)
			{
				return v;
			}
			else
			{
				Node p = find(v.parent);
				v.parent = p;
				return p;
			}
		}
		
		public void union(int u,int v)
		{
			Node ru = find(ds.get(u));
			Node rv = find(ds.get(v));
			
			if(ru != rv)
			{
				if(ru.rank > rv.rank)
				{
					rv.parent = ru;
				}
				else if(rv.rank > ru.rank)
				{
					ru.parent = rv;
				}
				else
				{
					rv.parent = ru;
					ru.rank++;
				}
			}		
		}
	}
	
	private class EdgePair{
		int u;
		int v;
		int cost;
		
		EdgePair(int u,int v,int cost)
		{
			this.u = u;
			this.v = v;
			this.cost = cost;
		}
		
		@Override
		public String toString()
		{
			return this.u+" - "+this.v+" @ "+this.cost;
		}
	}
	
	public ArrayList<EdgePair> getAllEdges()
	{
		ArrayList<EdgePair> edl = new ArrayList<>();
		for(int u:map.keySet())
		{
			for(int v:map.get(u).keySet())
			{
				edl.add(new EdgePair(u, v, map.get(u).get(v)));
			}
		}
		return edl;
	}
	
	public void krushkals()
	{
		ArrayList<EdgePair> edl = getAllEdges();
		Collections.sort(edl,new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		DisjointSets ds = new DisjointSets();
		
		for(int v: map.keySet())
			ds.createSet(v);
		
		
		for(EdgePair edge: edl)
		{
			int ru = ds.find(edge.u);
			int rv = ds.find(edge.v);
			
			if(ru != rv)
			{
				ds.union(edge.u, edge.v);
				System.out.println(edge);
			}
//			else
//			{
//				System.out.println("Cycle");
//			}
			
		}
	}
	
	
	public void prims()
	{
		PriorityQueue<EdgePair> pq = new PriorityQueue<>(new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		pq.add(new EdgePair(1, 0, 0));
		HashSet<Integer> visited = new HashSet<>();
		
		while(!pq.isEmpty())
		{
			EdgePair ep = pq.remove();
			if(visited.contains(ep.u))
			{
				continue;
			}
			visited.add(ep.u);
			System.out.println(ep);
			for(int nbbrs: map.get(ep.u).keySet())
			{
				if(!visited.contains(nbbrs))
				{
					pq.add(new EdgePair(nbbrs, ep.u, map.get(ep.u).get(nbbrs)));
				}
			}
		}
	}
	
	
	private class DijakstraEdgePair{
		int u;
		String v;
		int cost;
		
		DijakstraEdgePair(int u,String v,int cost)
		{
			this.u = u;
			this.v = v;
			this.cost = cost;
		}
		
		@Override
		public String toString()
		{
			return this.u+" via "+this.v+" @ "+this.cost;
		}
	}
	
	
	public void dijakstra()
	{
		PriorityQueue<DijakstraEdgePair> pq = new PriorityQueue<>(new Comparator<DijakstraEdgePair>() {

			@Override
			public int compare(DijakstraEdgePair o1, DijakstraEdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		
		pq.add(new DijakstraEdgePair(1, "", 0));
		HashSet<Integer> visited = new HashSet<>();
		
		while(!pq.isEmpty())
		{
			DijakstraEdgePair ep = pq.remove();
			if(visited.contains(ep.u))
			{
				continue;
			}
			visited.add(ep.u);
			System.out.println(ep);
			for(int nbbrs: map.get(ep.u).keySet())
			{
				if(!visited.contains(nbbrs))
				{
					pq.add(new DijakstraEdgePair(nbbrs, ep.v + " "+ ep.u, ep.cost + map.get(ep.u).get(nbbrs)));
				}
			}
		}
	}
	
	public void bellmonFord(int source)
	{
		int nv = map.size();
		int[] dis = new int[nv+1];
		Arrays.fill(dis, 100000);
		dis[source] = 0;
		
		ArrayList<EdgePair> al = getAllEdges();
		for(int i = 1; i <= nv; i++)
		{
			for(EdgePair edge:al)
			{
				if(dis[edge.v] > dis[edge.u] + edge.cost)
				{
					if(i == nv)
					{
						System.out.println("Negative Wt Cycle");
						return;
					}
					dis[edge.v] = dis[edge.u] + edge.cost;
				}
			}
		}
		
		for(int i = 1; i <= nv; i++)
		{
			System.out.println(i +" ---> "+dis[i]);
		}
		
	}
	
}
