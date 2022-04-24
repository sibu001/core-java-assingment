package classObject.com;

public class Static2 { 
	int a =10;
	int b=20;
	static int c=30;
	static int d=40;
	
	
	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Static2.c);
		System.out.println(Static2.d);
		
	}
    static void m2() {
    	Static2 x = new Static2();
    	System.out.println(x.a);
    	System.out.println(x.b);
    	System.out.println(Static2.c);
    	System.out.println(Static2.d);
	
}
    public static void main(String[] args) {
    	Static2 s = new Static2();
    	s.m1();
    	System.out.println("*********************");
    	Static2.m2();
		
	}
}
