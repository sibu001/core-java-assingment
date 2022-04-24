package comparable.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class abc implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}

public class Hashset_obj {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("sibu");
		hs.add("pradeep");
		hs.add("kuamr");
		hs.add("ramlal");
	    
          
	}
}
