package collectionsFM;

import java.util.TreeSet;

public class Linked_hashset {
	public static void main(String[] args) {
		TreeSet<String> lh= new TreeSet<String>();
		lh.add("aaa");
		lh.add("bbb");
		lh.add("ccc");
		lh.add("aaa");
		lh.add(null);
	//lh.getClass();               // first way to print 
	System.out.println(lh);
	}}	
		//System.out.println(lh);
		//for(String ss:lh) {               // second way to print using for each
		//	System.out.println(ss);
//			Iterator<String> itr = lh.iterator();     // iterator bhi use kr skte hai ......these are 3 ways 
//			while(itr.hasNext()) {
//				String i=itr.next();
//		}
//		System.out.println(lh);
//	}


