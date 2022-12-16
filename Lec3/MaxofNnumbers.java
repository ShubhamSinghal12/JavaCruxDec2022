package Lec3;

import java.util.Scanner;

public class MaxofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int i = 1;
		while(i <= n)
		{
			int x = sc.nextInt();
			if(x > max)
			{
				max = x;
			}
			i++;
		}
		System.out.println(max);
		
	}

}
