package arthimaticoperators;

public class Assg {
	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		// 3 way to call static variable//
		System.out.println(a);  // direct
		System.out.println(Assg.a); // by class name
		Assg a= new Assg();   // by creating object
		System.out.println(a.a);
		
	}

}

