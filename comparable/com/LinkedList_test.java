package comparable.com;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class emp2 implements Comparable<emp2>{
	
	Integer id;
	String name;

	
	public emp2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public int compareTo(emp2 o) {
		// TODO Auto-generated method stub
		return -id.compareTo(o.id);
	}

	
	}
  
public class LinkedList_test {
	public static void main(String[] args) {
		LinkedList<emp2> ll= new LinkedList<emp2>();
		ll.add(new emp2(22,"sibu"));
		ll.add(new emp2(15,"pradeep"));
		ll.add(new emp2(66,"kumar"));
		Collections.sort(ll);;
		for(emp2 ee:ll) {
			System.out.println(ee.id+" "+ee.name);
		}
	}

}
