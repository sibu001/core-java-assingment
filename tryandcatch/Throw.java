package tryandcatch;

class InvalidAge extends Exception {
	 InvalidAge (String s) {
		 super(s);
		 }
} 
	
		                                             // checked exception always thr

// parametrise constructor give us infomation while non parametrise dont give us information.

public class Throw {
	public static void valAge(int i) throws InvalidAge {
		if (i < 18) {
			throw new InvalidAge(" nahi ho skti shadi bhai samaj!!!!!!");
			
		} else {
			System.out.println("legal");
		}
		System.out.println(" go for it");
	}

	public static void main(String[] args) {
		try {
			Throw.valAge(10/2);
		} catch (InvalidAge e) {
			System.out.println("Caught the exception");
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
