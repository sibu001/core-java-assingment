package collectionsFM;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer,String> m = new TreeMap<Integer, String>();

		m.put(104, "aaa");
		m.put(103, "bcd");
		m.put(104, "abc");
		m.put(102, "sibu");
		m.put(101, "kumar");
    //	m.put(null, null);
	//	m.put(100,null);
	//	System.out.println(m);	
//		m.remove(101);
//		System.out.println(m);

		System.out.println(m.get(109));
//		System.out.println(m.getOrDefault(107, "xxx"));
//		
		System.out.println(m);

		//for (Map.Entry mp : m.entrySet()) {
		//	System.out.println(mp.getKey());
		//	System.out.println(mp.getValue());
		}

	}


	


