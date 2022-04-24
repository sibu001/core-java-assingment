package mappracticle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

class emp {
	int id;
	String name;

	public emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

class student {
	int id;
	String name;

	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

public class Linkedhash_empstu {
	public static void main(String[] args) {
		LinkedHashMap<emp, student> lhm = new LinkedHashMap<emp, student>();
		lhm.put(new emp(11, "sibu"), new student(22, "pradeep"));
		lhm.put(new emp(33, "kumar"), new student(44, "shrivastav"));
		lhm.put(new emp(55, "babu"), new student(66, "shona"));
		 Set<emp> ss=lhm.keySet();
		for(emp e:ss) {
		 System.out.println(e.id+" "+e.name);
		 }
//		for(emp ee:lhm.keySet()) {                 // print key using for each loop
//			System.out.println(ee.id+" "+ee.name);
//		}
//		for(student s:lhm.values()) {             // print values using for each loop
//			System.out.println(s.id+" "+s.name);
//		}
//		Set<Entry<emp, student>> xx = lhm.entrySet();     // map dont allow cursor directly so first we have to convert it into set then use iterator 
//		                                                           //cursor
//		Iterator<Entry<emp, student>> itr = xx.iterator();
//		while (itr.hasNext()) {
//			Entry<emp, student> e = itr.next();
//			emp ee = e.getKey();
//			System.out.println(ee.id + " " + ee.name);
//			student s = e.getValue();
//			System.out.println(s.id + " " + s.name);
//		}
	}

}
