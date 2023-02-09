package Lec26;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gn(2,2,"");

	}
	
	public static void gn(int op,int clo,String ans)
	{
		if(op == 0 && clo == 0)
		{
			System.out.println(ans);
		}
		else if(op < 0 || clo < op)
			return;
		else
		{
			gn(op-1,clo,ans+"(");
			gn(op,clo-1,ans+")");
		}
	}

}
