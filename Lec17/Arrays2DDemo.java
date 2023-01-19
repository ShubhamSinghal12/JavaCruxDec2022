package Lec17;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DDemo {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
//		arr[0] = new int[3];
//		arr[1] = new int[5];
//		arr[2] = new int[2];
		
//		System.out.println(arr);
//		arr[0][1] = 100;
//		System.out.println(Arrays.toString(arr[0]));
//		System.out.println(arr[0][1]);
//		System.out.println(Arrays.deepToString(arr));
		
		
//		takeInput(arr);
//		System.out.println("---------------------------");
		display(arr);
		
	}
	
	public static void takeInput(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void display(int[][] arr)
	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = 0; j < arr[i].length;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int[] i: arr)
		{
//			for(int j: i)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
			System.out.println(Arrays.toString(i));
		}
		
//		for(int i = 0 ;i < arr.length; i++)
//		{
//			for(int j: arr[i])
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
	}
	

}
