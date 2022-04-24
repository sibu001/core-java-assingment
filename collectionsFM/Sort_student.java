package collectionsFM;

import java.util.ArrayList;
import java.util.Collections;


class student1 implements Comparable<student1> {
	int id;
	String name;

	public student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(student1 o) {
		return name.compareTo(o.name);
	}
//	      if(id==o.id) {
//			return 0;
//		}else if(id>o.id) {
//			return 1;
//		}else 
//			return -1;
//	}
}

public class Sort_student {
	public static void main(String[] args) {
		ArrayList<student1> al = new ArrayList<student1>();
		al.add(new student1(43, "sibu"));
		al.add(new student1(22, "pradeep"));
		al.add(new student1(333, "kumar"));
		Collections.sort(al);
		for (student1 ss : al) {
			System.out.println(ss.id + " " + ss.name);
		}

	}

}
