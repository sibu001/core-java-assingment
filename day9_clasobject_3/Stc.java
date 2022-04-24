package day9_clasobject_3;

public class Stc {
	static int a=10;
	 static void m1() {
		 a=20;
	
		System.out.println(Stc.a);       // we can use direct variable name also like sysout(a).
	}
	public static void main(String[] args) {
		Stc s= new Stc();
		s.m1();
	}

}
