package classObject.com;

public class Static {
	int a = 10;
	int b = 20;
// we can create object in any method or in constructor ,dont think it is only created in main method//
	static void m1() {
		Static s = new Static();
		System.out.println(s.a);
		System.out.println(s.b);
	}

	static void m2() {
		Static s = new Static();
		System.out.println(s.a);
		System.out.println(s.b);

	}

	public static void main(String[] args) {
		Static.m1();
		Static.m2();

	}
}
