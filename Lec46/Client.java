package Lec46;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		int[] in = {10,20,30,40,50,60,70};
		bst.createTree(in);
		bst.display();
		System.out.println();
		bst.add(35);
		bst.display();

	}

}
