package day9_clasobject_3;
class a{
	static int i=10;
	}

class b {
	double m2() {
		int b=a.i;
		return Math.E*b;
		}
	double m3() {
		int b=a.i;
		return Math.PI*b;
	}
}

public class Day8 {
	public static void main(String[] args) {
		b B= new b();
		System.out.println(B.m2());
		System.out.println(B.m3());
	}

}
