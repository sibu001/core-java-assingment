package classObject.com;          //this keyword use to invoke current class method also
class x{  
void m()
{System.out.println("hello m");}  
void n(){  
System.out.println("hello n");  
//m();//same as this.m()  
this.m();  
}  
}  

public class This {
	public static void main(String args[]){  
		x a=new x();  
		a.n();  
		}}  



