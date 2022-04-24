package mappracticle;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

class product{
	int id;
	String name;
	public product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	}
class com implements Comparator<product>{

	@Override
	public int compare(product o1, product o2) {
		
		return -o1.name.compareTo(o2.name);
	}
}
	


public class Map_productdata {
	public static void main(String[] args) {
		TreeMap<product, String> tm= new TreeMap<product,String>(new com());
		tm.put(new product(11,"pen"), "aaa");
		tm.put(new product(233,"paper") , "bbb");
		tm.put(new product(27,"oil"), "ccc");
		tm.put(new product(61,"table"), "ddd");
	    Set<product> s=	tm.keySet();
	    for(product pp:s) {
	    	System.out.println(pp.id+" "+pp.name);
	    }
	}

}
