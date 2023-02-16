import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,4,2};
		nextPermut(arr);
		System.out.println(Arrays.toString(arr));
		}

	public static void nextPermut(int[] arr){
        
		int i = arr.length-2;
		for(;i>=0;i--)
		{
            if(arr[i]<arr[i+1])
            {
                break;
            }
        }
		
		for(int j=arr.length-1;j>=0;j--){
            if(arr[j]>arr[i]){
                swap(arr,i,j);
                break;
            }
        }
		
        reverse(arr,i+1,arr.length-1);
    }

	
	public static void swap(int [] arr,int si,int ei)
	{
           
		int temp=arr[si];
	     arr[si]=arr[ei];
	     arr[ei]=temp;
	}
	public static void  reverse(int [] arr,int si,int ei)
	{
		while(ei>si)
		{
			swap(arr,si,ei);
			si++;
			ei--;
		}
	}
}
