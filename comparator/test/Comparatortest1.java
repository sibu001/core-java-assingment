package comparator.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class worker {
	int id;
	String name;
	String add;

	public worker(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
}

class id implements Comparator<worker> {

	@Override
	public int compare(worker o1, worker o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
}

class name implements Comparator<worker> {

	@Override
	public int compare(worker o1, worker o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

public class Comparatortest1 {
	public static void main(String[] args) {
		LinkedList<worker> ll = new LinkedList<worker>();
		ll.add(new worker(21, "sibu", "indore"));
		ll.add(new worker(3, "pradeep", "rewa"));
		ll.add(new worker(31, "amitabh", "korba"));
		ll.add(new worker(20, "jagga daku", "chambal"));
		Collections.sort(ll, new id());
	
		for (worker w : ll) {
		System.out.println(w.id + " " + w.name + " " + w.add);
	}
	}

}
