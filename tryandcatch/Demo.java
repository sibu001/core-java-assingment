package tryandcatch;



public class Demo {
	public static void main(String[] args) {
	        System.out.println("sibu");
	         try	{System.out.println("pradeep".charAt(2));
	         	System.out.println(10/0);
	         	System.exit(1);}
	         	
	          
	       catch( ArithmeticException ae) {
	    	   System.out.println(" kya yr");
	    	   System.exit(2);
	       }
	      finally { System.out.println("rest");}
	}

}
