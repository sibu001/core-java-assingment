package collectionsFM;

import java.util.Iterator;
import java.util.Vector;

public class Vectortest {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 1; i <=20; i++) {
			v.add(i);
		}
		//System.out.println(v);
		// remove odd element using iterator cursor
		Iterator<Integer> itr = v.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}
		}
		System.out.println(v);
	}
}