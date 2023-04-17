package Lec52;

import java.util.Map;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGraph gp = new MyGraph(7);
		gp.addEdge(1, 2, 10);
		gp.addEdge(1, 4, 40);
		gp.addEdge(3, 2, 20);
		gp.addEdge(3, 4, 30);
		gp.addEdge(4, 5, 80);
		gp.addEdge(5, 6, 90);
		gp.addEdge(6, 7, 7);
		gp.addEdge(5, 7, 15);
		
//		gp.display();
//		gp.removeEdge(4,5);
//		System.out.println();
//		gp.display();
		
//		System.out.println(gp.hasPath(1, 7));
		gp.printAllPaths(1, 7);

	}

}
