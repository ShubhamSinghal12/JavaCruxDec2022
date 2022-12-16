package Lec3;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n = sc.nextInt();
		while(i <= n)
		{
			System.out.println("Hello");
			++i;
		}
		System.out.println("Bye");
	}
	

}
