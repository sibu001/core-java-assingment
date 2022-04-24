package classObject.com;

public class Student {
	int rollno;
	String name;

	// initialization via reference
	public static void main(String[] args) {
		Student s = new Student(); // create object
		s.rollno = 10; // initialised via reference
		s.name = "sibu";
		System.out.println(s.rollno + " " + s.name);

	}

}
