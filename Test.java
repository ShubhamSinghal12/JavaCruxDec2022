import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		printArmstrong(1000);
	}
	
	public static int digits(int N) {
		int d =(int) Math.log10(N)+1;
		return d;
	}
	
	public static boolean isArmstrong(int N) {
		int d =digits(N);
		int temp=N;
		int ans=0;
		while(N!=0) {
			int num=N%10;
			 ans+=(int)Math.pow(num,d);
			 N/=10;
		}
		if(ans==temp) {
			return true;
		}else {
			return false;
		}
	}

	public static void printArmstrong(int N) {
		for(int i=1;i<=N;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}


}
