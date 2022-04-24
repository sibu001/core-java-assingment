package tryandcatch;

public class Demo2 {
	public static void main(String[] args) {
	     System.out.println(10/5);
	     try { System.out.println("rest".charAt(10));}
	    		//finally{ System.out.println("sibu");}
	         
	
	     catch(ArithmeticException aa)
	{
		System.out.println("catch");
	}
	     catch(StringIndexOutOfBoundsException ae) {
	    	 System.out.println("hiiii" +ae);
	    	// ae.printStackTrace();
	     }
	     finally {System.out.println("sssss");}

}
	}
