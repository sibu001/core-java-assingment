package mappracticle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

class emp22  {
	int id;
	String name;

	public emp22(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}

class manag {
	String add;
	int phone;

	public manag(String add, int phone) {
		super();
		this.add = add;
		this.phone = phone;
	}

}

public class Test10 {
	public static void main(String[] args) {
		HashMap<emp22, manag> tm = new HashMap<emp22, manag>();
		tm.put(new emp22(11, "sibu"), new manag("indore", 776655));
		tm.put(new emp22(1, "kamlendra"), new manag("rewa", 776666));
		tm.put(new emp22(111, "pradeep"), new manag("korba", 776677));
		tm.put(new emp22(12, "amar"), new manag("bilaspur", 776688));
		Set<emp22> s=tm.keySet();
		for(emp22 ee:s) {
			System.out.println(ee.id+" "+ee.name);
			Collection<manag> cc=tm.values();
			for(manag m:cc) {
			System.out.println(m.add+" "+m.phone);
					
				}
			}
		}
	}


