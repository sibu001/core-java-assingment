package abstraction;

abstract  class a {
	abstract void m1(int a);

	abstract void m2(int a, int b);

	abstract void m3(int a, String name);

	   a() { System.out.println("  a construtor");}
	   {System.out.println("instance block");}
	   
	   static {System.out.println("static block");}

		  
	  }
		  

	class b extends a {
		void m1(int a) {
			System.out.println("m1 method");
		}

		void m2(int b, int a) {
			if (a > b) {
				System.out.println(" a is bigger");
			} else if (b > a) {
				System.out.println("b is bigger");
			} else if (a == 0 && b == 0) {
				System.out.println("what the hell is this man");
			} else {
				System.out.println("null");
			}
		}

		void m3(int c, String name) {
			System.out.println("m3 method");}
		{System.out.println(" insta block");}
		
		static {System.out.println(" sta block");}

		
		//b()
	//	{ super();
		//	System.out.println(" b const");}
	}

public class ABC {
	public static void main(String[] args) {
          a obj;
	  obj = new b();
	obj.m2(10,20);
	obj.m1(20);
	obj.m3(20,"sibu");
	// a A = new a();    // we can not make a object of a abstract class
	
	}
}
