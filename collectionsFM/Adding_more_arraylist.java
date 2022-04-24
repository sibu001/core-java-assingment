package collectionsFM;

import java.util.ArrayList;

public class Adding_more_arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(40);
		a2.add(50);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(67);
		a3.add(80);
		a3.addAll(a2);
		a3.addAll(a1);
		System.out.println(a3);

	}
}
