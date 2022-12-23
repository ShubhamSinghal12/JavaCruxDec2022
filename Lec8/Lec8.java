package Lec8;

public class Lec8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 100;
		short s = b;
		int i = s;
		long ln = 10000000000L;
		
		float f = 3.14f;
//		f = ln;
		ln = (long)f;
		System.out.println(ln);
		
		double d = 1.2;
		
		char ch = 'a';
		i = ch;
		System.out.println(i);
		
		ln = (long)(2+3.2+5l);
		System.out.println(ln);
		System.out.println((char)('a'+3));
		
		System.out.println(20+30+"a"+10+20);
	}

}
