package Lec17;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spiralPrint(arr);

	}
	
	public static void spiralPrint(int[][] arr)
	{
		int ele = 0;
		int te = arr.length*arr[0].length;
		int minr = 0,maxr = arr.length-1, minc = 0, maxc = arr[0].length-1;
		while(ele < te)
		{
			for(int i = minc; i <= maxc && ele < te; i++)
			{
				System.out.print(arr[minr][i]+" ");
				ele++;
			}
			minr++;
			
			for(int i = minr;i <= maxr && ele < te; i++)
			{
				System.out.print(arr[i][maxc]+" ");
				ele++;
			}
			maxc--;
			
			for(int i = maxc; i >= minc && ele < te; i--)
			{
				System.out.print(arr[maxr][i]+" ");
				ele++;
			}
			maxr--;
			
			for(int i = maxr; i >= minr && ele < te; i--)
			{
				System.out.print(arr[i][minc]+" ");
				ele++;
			}
			minc++;
		}
		
	}

}
