package classObject.com;

class a {
	int a = 100;
	int b = 200;

	void m1() {
		int a = 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
	}
}
class b extends a{
	int a=45;
	void m2() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
		m1();
		
	}
}

public class Multi_In {
	public static void main(String[] args) {
		b B = new b();
		B.m2();
		
	}

}
