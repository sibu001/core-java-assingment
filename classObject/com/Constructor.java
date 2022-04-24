package classObject.com;

public class Constructor {
	int i;
	public Constructor() {     //constructor non parametrised
		i=100;
		System.out.println("in constructor");
	}
	public Constructor(int p) {   // constructor parametrised
	      i=p;
		System.out.println("in para constructor");
	}
	public void init() {
		i=10;}
	public void display() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Constructor obj= new Constructor(13/6);
		obj.display();
		
	}
				
	

}
