package comparator.test;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetcom { 
	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>(new sibu());  // 
		ts.add("sibu");
		ts.add("pradeep");
		ts.add("akshy");
		ts.add("zoro");
		System.out.println(ts);
	}}

class sibu implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);   // minus sign is used for decending order
	}


	}
	

