package Lec2;

import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int p,r,t;
		p = sc.nextInt();
		r = sc.nextInt();
		t = sc.nextInt();
		
		int si;
		si = (p*r*t)/100;
		
		System.out.println(si);
	}

}
