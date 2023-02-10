import java.util.Scanner;

public class Test {
	static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		
//		System.out.println(Math.sqrt(-2));
		String s = "12";
		int i = 12;
		char ch = 12 - 1 + 'A';
		System.out.println(ch);
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
