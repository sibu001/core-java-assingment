package collectionsFM;

import java.util.LinkedHashSet;

public class Test2 {
	public static void main(String[] args) {

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("rounak");
		hs.add("bhupendra");
		hs.add("shweta");
		hs.add("amit");
		hs.add("rounak");
		hs.add(null);

		System.out.println(hs);
	}

}
