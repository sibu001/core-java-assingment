package classObject.com; 
class student{
	int roll;
	String name;
	
	void m1() {
		System.out.println(name+"  "+roll);
	}
}

public class InitializingThroughMethod {
	public static void main(String[] args) {
		student s= new student();
		student s1= new student();
		s.roll=12;
		s.name="sibu";
		s1.roll=23;
		s1.name="pradeep";
	      s.m1();
	      s1.m1();

}
}