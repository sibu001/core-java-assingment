package mappracticle;

import java.util.TreeMap;

public class Treemap_exp {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		        tm.put(100, "sibu");
		        tm.put(200, "pradeep");
		        tm.put(300, "kumar");
		        tm.put(400,null);
		        System.out.println(tm);
		        TreeMap<Integer,String> tm1= new TreeMap<Integer,String>(tm);
		        tm1.put(10000, "sibu");
		        tm1.put(600, "pradeep");
		        tm1.put(700, "kumar");
		        tm1.put(800,null);
		        System.out.println(tm1);
	}

}
