package comparable.com;

import java.util.Collections;
import java.util.LinkedList;

class worker implements Comparable<worker> {
	int id;
	String name;
	String add;

	public worker(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	public int compareTo(worker o) {
		return name.compareTo(o.name);
	}
}

public class Linkedtest_rable {
	public static void main(String[] args) {
		LinkedList<worker> al = new LinkedList<worker>();
		al.add(new worker(11, "sibu", "rewa"));
		al.add(new worker(12, "pradeep", "indore"));
		al.add(new worker(13, "kumar", "korba"));
		
		Collections.sort(al);
		for (worker w : al) {
			System.out.println(w.id + " " + w.name + " " + w.add);
		}
	}
}

