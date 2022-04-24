package mappracticle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test11 {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(11, "aaa");
		hm.put(1, "bb");
		hm.put(10, "cc");
		hm.put(12, "aaa");
		hm.put(100, null);
		System.out.println(hm);
//		Set<Integer>ss=hm.keySet();
//		System.out.println(ss);
//		Collection<String>cc=hm.values();
//		System.out.println(cc);
		
	}

}
