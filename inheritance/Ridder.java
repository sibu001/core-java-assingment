package inheritance;

interface c {
	public void m1();
}

interface   b {
	public  void m2();
}

interface rbi extends b {
	int rate = 5;
	void m2();
   void getintrest();
}

class sbi implements rbi {

	@Override
	public void m2() {
		System.out.println("b body");
	}

	@Override
	public void getintrest() {
		System.out.println(" rbi body");
	}
}

class axis implements b, c {
	public void m2() {
		System.out.println(" inter b");
	}

	public void m1() {
		System.out.println("inter c");
	}

}

class baroda implements rbi {

	@Override
	public void m2() {
		System.out.println("baroda m2");

	}

	@Override
	public void getintrest() {
		System.out.println("rbi intrest");

	}

}

public class Ridder {
	public static void main(String[] args) {
		rbi r;
		r = new sbi();
		r.getintrest();
		r.m2();
		r = new baroda();
		r.m2();

		axis ob = new axis();
		ob.m2();

	}

}
