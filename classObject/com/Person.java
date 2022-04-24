package classObject.com;

public class Person {
	String name; // both are reference variable
	int age;
	void files(String s,int a)// METHOD
	{
		name=s; //NAME IS INSTANCE VARIABLE
		age=a; // S IS LOCAL VARIABLE
	}
	void display() //METHOD
	{
		System.out.println(name+" "+age);
		}
	public static void main(String[] args) {
		Person p=new Person(); // p is object name
		p.files("pradeep",28); //CALL VIA METHOD
		p.display();
	}
	

}
