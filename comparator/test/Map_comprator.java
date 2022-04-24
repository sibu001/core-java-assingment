package comparator.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
class yyy implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}

public class Map_comprator {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "sibu");
		hm.put(32, "pradeep");
		hm.put(22, "vvv");
		hm.put(2, "sss");
		System.out.println(hm);
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>(new yyy());
		tm.putAll(hm);
		System.out.println(tm);
	}

}
