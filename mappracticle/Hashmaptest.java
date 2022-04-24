package mappracticle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmaptest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(null, "sibu");
		hm.put(20, null);
		hm.put(30, "bbb");
		hm.put(40, "ddd");
		hm.put(50, "bbb");
		// System.out.println(hm);
		 for(Map.Entry<Integer, String> h:hm.entrySet()) {
		 System.out.println(h);
//		Set<Entry<Integer, String>> ss = hm.entrySet();
//		Iterator<Entry<Integer, String>> pp = ss.iterator();
//		while (pp.hasNext()) {
//			Entry<Integer, String> ee = pp.next();
//			System.out.println(ee);
		}
	}

}
