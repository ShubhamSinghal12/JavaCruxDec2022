import java.util.Scanner;

public class Test {

	static Scanner sn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=new int[5];
		
		takeinput(arr);
		System.out.println();
		printArray(arr);
		System.out.println();
		rotatearray(arr);
		printArray(arr);
	}
	
	public static int[] takeinput(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=sn.nextInt();
		}
		return arr;
	}
	
	public static void  printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void rotatearray(int[] arr) {
		int temp=arr[arr.length-1];
		int n = arr.length-1;
		for(int i=n;i>=1;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}




}
