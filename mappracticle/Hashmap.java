package mappracticle;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, null);
		m.put(null, "pradeep");
		m.put(3, null);
		m.put(4, "shrivastav");
		//System.out.println(m);
		HashMap<Integer,String> c= new HashMap<Integer,String>(m);
		c.put(22,"abc");
		c.put(33, "ddd");
		c.put(66, "hhh");
	    c.putAll(m);
	//System.out.println(c);
	c.putIfAbsent(11, "shrivastav");
	System.out.println(c);

		
		
		
	//	m.remove(101);
	//	System.out.println(m);

		//System.out.println(m.get(101));
		//System.out.println(m.getOrDefault(104, "jain"));
//		
		//System.out.println(m);

		//for (Map.Entry mp : m.entrySet()) {
		//	System.out.println(mp.getKey());
		//	System.out.println(mp.getValue());
//		}

	}}

	


