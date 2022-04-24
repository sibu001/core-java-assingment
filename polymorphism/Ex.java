package polymorphism;
class Animal{  
	void eat(){System.out.println("eating");}  
	}  
	class Dog extends Animal{  
	void eat(){System.out.println("eating fruits");}  
	}  
	class BabyDog extends Dog{  
	void eat(){System.out.println("drinking milk");}  
	 
	

}
// run time polymorphism with multilevel inheritance
public class Ex {
	public static void main(String args[]){ 
		Animal a =new Animal();
		a.eat();
	    a= new Dog();
	    a.eat();
	    a= new BabyDog();
	    a.eat();
	}
}	

	
