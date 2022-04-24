package abstraction;

public class DriverClass {
                                                  // new Driverclass means it return object of Driver class or instance of class
	public static DriverClass getInstance() {      // we created a static method of driver class
		System.out.println("Driver class");        // return type- Driver class
		return new DriverClass();                   // method name- getInstance
	}
	
	
	public static void main(String[] args) {
		Policybazar obj ; //  we cant make object or instance of abstract class ..so we take reference of only//
		obj=new IciciBank();
		obj.getRateOfInterest();
		obj= new SBI();
		obj.getRateOfInterest();
		
		
		DriverClass obj1 = DriverClass.getInstance();
		
	}

}
