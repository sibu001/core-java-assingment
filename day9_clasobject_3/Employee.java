package day9_clasobject_3;



public class Employee {
	static int nextid=1;
	
	void m1() {
		int a=nextid++;
		System.out.println(a);
		}
	public static void main(String[] args) {
		Employee e;
		e= new Employee();
		e.m1();
		Employee e1=new Employee();
		e1.m1();
		Employee e2= new Employee();
		e2.m1();
		
		
		
	}

}
