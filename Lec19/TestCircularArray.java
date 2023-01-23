package Lec19;

public class TestCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for(int i = 3;i < 3+arr.length;i++)
		{
			System.out.println(arr[i%arr.length]);
		}
		
		
	}

}
