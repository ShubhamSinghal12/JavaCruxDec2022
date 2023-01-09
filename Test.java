import java.util.Scanner;

public class Test {
	static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr = {2,4,9,7,5};
		int max = 9;
		
		
		for(int i = 1; i <= max; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(max-arr[j] < i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	public static void takeinput(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int [] arr,int si,int ei)
	{
           
		int temp=arr[si];
	     arr[si]=arr[ei];
	     arr[ei]=temp;
	}
	public static void  reverse(int [] arr)
	{
		int si=0;
		int n=arr.length-1;
		int ei=n;
		while(ei>si)
		{
			swap(arr,si,ei);
			si++;
			ei--;
		}
	}
}
