package comparable.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
class xxx implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
}

public class Set_test {
	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
	        hs.add("sibu");
	        hs.add("pradeep");
	        hs.add("zozo");
	        hs.add("jojo");
	 TreeSet<String> ts= new TreeSet<String>(new xxx());
	 ts.addAll(hs);
	 System.out.println(ts);
}
}