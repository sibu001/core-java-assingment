package tryandcatch;

public class Demo4 {
	void m1() {
		m2();
	};

	void m2() {
		m3();
	};

	void m3() {
	System.out.println("sibu".charAt(2));
	}
	public static void main(String[] args) {
		Demo4 d= new Demo4();
		try{d.m1();
			//System.out.println(10 / 0);
		} catch (IndexOutOfBoundsException ae) {
			System.out.println("kya baat");
			System.out.println(ae.getMessage()); //
			//System.out.println(ae);                //any 3 method we can use
		//	ae.printStackTrace();             //  
		}
	}

}
