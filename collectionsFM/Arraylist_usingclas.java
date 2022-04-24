package collectionsFM;

import java.util.ArrayList;

class emp{
	int id;
	String name;
	emp(int id,String name){
		super();
		this.id=id;
		this.name=name;
	}}
class student{
	int id;
	String name;
	student(int id,String name){
		super();
		this.id=id;
		this.name=name;
	}
}

public class Arraylist_usingclas {
	public static void main(String[] args) {
		ArrayList<emp> s=new  ArrayList<emp>();
		s.add(new emp(1,"sibu"));
		s.add(new emp(2,"pradeep"));
		ArrayList<student>s1=new ArrayList<student>();
		s1.add(new student(111,"sibu"));
		s1.add(new student(222,"pradeep"));
	
		
   for(emp e:s) {                         // by for each loop
	System.out.println(e.id+" "+e.name);
}
   for(student ss:s1) {
	   System.out.println(ss.id+"  "+ss.name);
   }
 //  emp e=s.get(1);{                         // by index
	 //  System.out.println(e.id+" "+e.name);
  // }
	
	
}}
