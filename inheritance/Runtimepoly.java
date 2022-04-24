package inheritance;

import java.util.Scanner;

class rbi1 {
	public double getintrest() {
		return 4.5;
	}
}

class sbi1 extends rbi1 {
	public double getintrest() {
		return 5;
	}
}

class axis1 extends rbi1 {
	public double getintrest() {
		return 5.5;
	}
}

class icici extends rbi1 {
	public double getintrest() {
		return 5.8;
	}

}

public class Runtimepoly {
	public static void main(String[] args) {
		rbi1 r;
		r = new sbi1();
		System.out.println(r.getintrest());

	}

}
