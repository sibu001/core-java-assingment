package classObject.com;

public class Stc {
	int a=10;
	int b=100;
	static int c=1000;
	static int d=10000;
	
	    void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	static void m2() {
		Stc s = new Stc();
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c); // we can call static variable by object also
		//System.out.println(Stc.c);// we can call static variable by class name also
		System.out.println(s.d);
		//System.out.println(Stc.d);
	}
	
	public static void main(String[] args) {
	   Stc s= new Stc();
		s.m1();
		Stc.m2();
		
	}
	

}
