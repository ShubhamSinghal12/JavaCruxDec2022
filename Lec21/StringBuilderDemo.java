package Lec21;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "Hello";
//		StringBuilder sbt = new StringBuilder(s);
//		System.out.println(sbt);
//		sbt.append(10);
//		System.out.println(sbt);
//		sbt.insert(2, "ABC");
//		System.out.println(sbt);
//		System.out.println(sbt.charAt(1));
//		sbt.setCharAt(1, 'D');
//		System.out.println(sbt);
//		sbt.deleteCharAt(0);
//		System.out.println(sbt);
//		sbt.delete(0, 3);
//		System.out.println(sbt);
//		String s1 = sbt.toString();
		
		StringBuilder sbt = new StringBuilder();
		String st = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
		{
			st = st+'a';
//			sbt.append('a');
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
	}

}
