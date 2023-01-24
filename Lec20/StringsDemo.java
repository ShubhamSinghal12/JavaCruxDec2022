package Lec20;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "helloll";
		String s1 = "abc";
		String s2 = new String("abc");
//		System.out.println(s==s1);
//		System.out.println(s==s2);
//		
//		System.out.println(s.equals(s2));
		String s4 = "";
		
		System.out.println(s4.length());
		System.out.println(s.charAt(1));
		
		System.out.println(s.substring(1));
		
		System.out.println(s.indexOf("el"));
		System.out.println(s.lastIndexOf("el"));
		
		String st = s+'a';
		System.out.println(st);
		st = st.replace('l', 'r');
		System.out.println(st);
		

	}

}
