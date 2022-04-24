package classObject.com;
class poly{
	 void show() {
		//super show();{
		System.out.println("aur bta kaisa hai");}
		void m1() {
			System.out.println("gg");
		}
	}
class xyz extends poly{     // IS-A relationship(inheritance)
	public void show() {  // public void show also be used
   // super.show();
		{System.out.println("kya haal bhai");  // same pattern must be needed int a,string c
		
	}}}
	


public class MethodOveriding {
	public static void main(String[] args) {
	//	poly p = new poly();
    //	p.show();
		xyz x = new xyz();
		x.show ();
		x.m1();
	}

} 
// we cant  use 'public void' in poly class and only 'void show'in xyz class but vice versa is allowed