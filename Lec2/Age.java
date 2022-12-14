package Lec2;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		boolean b = age < 18;
		if(b)
		{
			System.out.println("Child");
		}
		else if(age < 65)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior Citizen");
		}
		
	}

}
