import java.util.*;
public class Working {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public void takeInput(int[][] arr) {
		// TODO Auto-generated method stub

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = sc.nextInt();

			}
		}

	}
	
	public void prints(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
