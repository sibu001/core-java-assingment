package comparable.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class abcd implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

	}

	
public class Test99 {
	public static void main(String[] args) {
		LinkedList<Integer> al= new LinkedList<Integer>();
	     al.add(10);
	     al.add(2);
	     al.add(30);
	     al.add(4);
	     Collections.sort(al, new abcd());
	     for(Integer i:al) {
	    	 System.out.println(i);
	     }

}
}





