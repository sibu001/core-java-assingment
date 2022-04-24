package comparator.test;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(34, "sibu", 22));
		al.add(new Emp(06, "pradeep", 43));
		al.add(new Emp(21, "kumar", 55));
		Collections.sort(al, new ID());
		for (Emp e : al) {
			System.out.println(e.id + " " + e.name);
		}

	}

}
