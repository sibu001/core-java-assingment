package tryandcatch;

class a {
	void m1() throws InterruptedException {
		System.out.println(" m1 method");
		Thread.sleep(1000);
		System.out.println(" m2 method");
	}

	void m2() throws InterruptedException {
		m1();
	}

	void m3() throws InterruptedException {
		m2();
	}

	void m4()  {
		try{m3();}
		catch(InterruptedException ae) {
			System.out.println("sibu");
		}
		finally {
			System.out.println(" close ");
		}
	}
}

public class Throws {
	public static void main(String[] args) {      // if m4 is also throws and main method also throws then jvm is reponsible to handle exception//
		{
			a A = new a();
			A.m4();
			}
		}
	}

