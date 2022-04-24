package comparator.test;

import java.util.Comparator;

public class ID implements Comparator<Emp> {

//	@Override
//	public int compare(Object o1, Object o2) {
//		Emp e= (Emp)o1;
//		Emp e2= (Emp)o2;
//		if(e.id==e2.id) {
//			return 0;
//		}else if (e.id>e2.id) {
//			return 1;}
//		else
//			return -1;
//		}

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.id==o2.id) {
			return 0;
		}else if(o1.id>o2.id) {
			return 1;
		}else
			return -1;
		
	}
		
	}


