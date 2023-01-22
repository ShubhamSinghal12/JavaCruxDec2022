package Lec18;

public class RowColSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean search(int[][] arr,int ele)
	{
		int i = 0;
		int j = arr[0].length-1;
		
		while(j >=0 && i < arr.length)
		{
			if(ele == arr[i][j])
				return true;
			else if (ele > arr[i][j])
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		return false;
			
	}

}
