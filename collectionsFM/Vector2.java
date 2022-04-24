package collectionsFM;

import java.util.List;
import java.util.Vector;

public class Vector2 {
	
		public static void main(String[] args) {
			
			Vector<String> lst= new Vector<>();
			
			lst.add("shewta");
			lst.add("bhupe");
			lst.add("rounak");
			lst.add("amit");
//			System.out.println(lst);
			
//			lst.add(2, "ranveer");
//			System.out.println(lst);
//			lst.remove(0);
//			System.out.println(lst);
	//
//			boolean b = lst.contains("rounak");
//			System.out.println(b);
			
//			
//			String bhai =lst.get(1);
//			System.out.println(bhai);
//				
//			
//			System.out.println(lst.size());
//			
//			for(int i=0;i<lst.size();i++) {
//				System.out.println(lst.get(i));
//			}
			
			List <String> lst1 = lst.subList(2, 3);;
			for(int i=0;i<lst1.size();i++) {
				System.out.println(lst1.get(i));
			}
		}
	

	}


