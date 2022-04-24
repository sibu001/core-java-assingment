package tryandcatch;



public class Throw1 {
	void marriage(int i) {
		if(i<18) {
			     ArithmeticException ae= new ArithmeticException();
			          throw ae;
		}
		else {System.out.println("allowed");
	}

}
	public static void main(String[] args)  {
		Throw1 t= new Throw1();
		try{t.marriage(17);}
		catch(ArithmeticException se) {
			//System.out.println(se.getMessage());
			System.out.println(" not allowed");
		}
	}
}