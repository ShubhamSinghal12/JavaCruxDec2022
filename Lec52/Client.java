package Lec52;

import java.util.Map;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyGraph gp = new MyGraph(7);
//		gp.addEdge(1, 2, 20);
//		gp.addEdge(1, 4, 60);
//		gp.addEdge(3, 2, 30);
//		gp.addEdge(3, 4, 20);
//		gp.addEdge(4, 5, 50);
//		gp.addEdge(5, 6, 80);
//		gp.addEdge(6, 7, 40);
//		gp.addEdge(5, 7, 70);
		
//		gp.display();
//		gp.removeEdge(4,5);
//		System.out.println();
//		gp.display();
		
//		System.out.println(gp.hasPath(1, 7));
//		gp.printAllPaths(1, 7);
//		System.out.println(gp.hasPathBFS(1, 7));
//		gp.DFST();
//		System.out.println(gp.isCycle());
//		System.out.println(gp.noOfConnectedComponents());
//		gp.printAllComponents();
//		gp.krushkals();
//		gp.prims();
//		gp.dijakstra();
		
		
		
		MyGraph gp = new MyGraph(5);
		gp.addEdge(1, 2, 8);
		gp.addEdge(1, 4, 3);
		gp.addEdge(1, 3, 4);
		gp.addEdge(3, 4, -3);
		gp.addEdge(4, 5, 4);
		gp.addEdge(5, 2, 2);
		gp.addEdge(2, 5, -10);
		
		gp.bellmonFord(1);

	}

}
