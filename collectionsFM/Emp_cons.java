package collectionsFM;

import java.util.ArrayList;

class stu{
	int id;
	String name;
	String add;
	int pno;
	
	public stu(int id, String name, String add, int pno) {
		
		this.id = id;
		this.name = name;
		this.add = add;
		this.pno = pno;
	}
	
}

public class Emp_cons {
	public static void main(String[] args) {
		
	
	stu a1= new stu(1,"sibu"," indore",9393);
	stu a2= new stu(2,"pradeep","rewa",888);
	stu a3= new stu(3,"kumar","korba",9887);
	stu a4= new stu(4,"rani","raipur",34343);
	ArrayList<stu> e= new ArrayList<stu>();
	     e.add(a1);
	     e.add(a2);
	     e.add(a3);
	     e.add(a4);
	     for(stu ss:e) {
	    	 System.out.println(ss.id+" "+ss.name+" "+ss.add+" "+ss.pno);
	     }

	     

}}

