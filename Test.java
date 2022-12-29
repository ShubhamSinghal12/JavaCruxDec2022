import java.util.Scanner;

public class Test {

	static Scanner sn = new Scanner(System.in);
    public static void main(String args[]) {
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sn.nextInt();
        }

        for(int val: arr){
            System.out.println(val);
        }
    }


}
