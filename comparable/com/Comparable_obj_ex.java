package comparable.com;

import java.util.HashSet;
import java.util.TreeSet;

class management implements Comparable<management>{
	int id;
	String name;
	int phnone_no;
	public management(int id, String name, int phnone_no) {
		super();
		this.id = id;
		this.name = name;
		this.phnone_no = phnone_no;
	}
	@Override
	public String toString() {
		return "management [id=" + id + ", name=" + name + ", phnone_no=" + phnone_no + "]";
	}
	@Override
	public int compareTo(management o) {
	if(this.phnone_no==o.phnone_no) {
		return 0;
	}else if(this.phnone_no<o.phnone_no) {
		return 1;
	}else {
		return -1;
	}
	}
	}

public class Comparable_obj_ex {
	public static void main(String[] args) {
		HashSet<management> hs= new HashSet<management>();
		hs.add(new management(11,"sibu",762));
		hs.add(new management(10,"zozo",847));
		hs.add(new management(19,"chaganlaal",747));
		hs.add(new management(111,"xalxo",767));
		TreeSet<management>ts=new TreeSet<management>();
		ts.addAll(hs);
		System.out.println(ts);
		}

}
