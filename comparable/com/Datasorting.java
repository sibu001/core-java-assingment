package comparable.com;

import java.util.ArrayList;
import java.util.Collections;

class emp1 implements Comparable<emp1> {
	int id;
	String name;
	String add;

	public emp1(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	public int compareTo(emp1 o) {
		return name.compareTo(o.name);
	
	 
//			if(id==o.id) {
//				return 0;
//			}
//			else if(id>o.id) {
//			return 1;
//		}else {
//				return -1;
//			}
//		}
	}

public class Datasorting {
	public static void main(String[] args) {
		ArrayList<emp1> al = new ArrayList<emp1>();
		al.add(new emp1(10, "sibu", "korba"));
		al.add(new emp1(2, "pradeep", "rewa"));
		al.add(new emp1(32, "kumar", "raipur"));
		Collections.sort(al);
		for (emp1 e : al) {
			System.out.println(e.id + " " + e.name + " " + e.add);
		}

	}
}}