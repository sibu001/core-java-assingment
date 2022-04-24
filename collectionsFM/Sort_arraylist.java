package collectionsFM;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_arraylist {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("sibu");
		al.add("pradeep");
		al.add("rani");
		al.add("kumar");
		System.out.println("before sort"+al);
		Collections.sort(al);
		System.out.println("after sort"+al);
	}

}
