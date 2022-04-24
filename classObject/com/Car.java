package classObject.com;

public class Car {
	String name;
	String colour;
	String model;
	public Car(String name,String colour,String model) {  // construtor
		this.name= name;
		this.colour= colour;
		this.model= model;}
	public void describe() {
		System.out.println("Car [name=" + name + ", colour=" + colour + ", model=" + model + "]");
	}
	public static void main(String[] args) {
		Car c = new Car("baleno","blue","2019");
		//System.out.println(c.name+" "+c.colour+" "+c.model);
	   c.describe();


	}
		
	}
	


