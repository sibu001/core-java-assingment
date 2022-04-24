package comparable.com;
import java.util.Comparator;
import java.util.TreeSet;

class mycomp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}

public class Comparable_test {
	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>(new mycomp());
		ts.add("sibu");
		ts.add("vv");
		ts.add("cc");
		ts.add("oo");
		for(String s:ts) {
			System.out.println(s);
		}
	

	}	
	}

