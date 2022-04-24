package tryandcatch;

public class Netflix {
	

		
		public void checkAge(int age) {
			if(age<18) {
				//System.out.println("you are not elligible for the content");
				ArithmeticException obj =new ArithmeticException();
				throw obj;
			}else {
				System.out.println("you are elligible for the content");
			}
			
			System.out.println("Successfully Logged in");
		}
		
		
		public static void main(String[] args) {
			Netflix chill = new Netflix();
			try {
			chill.checkAge(10);
			}catch(ArithmeticException e) {
				System.out.println("you are not elligible for ");
			}
		}
		
	}



