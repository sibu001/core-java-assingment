package mappracticle;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
class compa implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

	
}

public class Treemap_ex {
	public static void main(String[] args) {
		TreeMap<Integer,String>tm= new TreeMap<Integer,String>(new compa());
		tm.put(10, "abc");
		tm.put(11, null);
		tm.put(2, "cibu");
		tm.put(32, "pradeep");
		System.out.println(tm);
		Set<Integer> s=tm.keySet();
		for(Integer i:s) {
			System.out.println(i);
	
		}
	}

}
