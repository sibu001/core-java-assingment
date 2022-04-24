package tryandcatch;

public class Finally {
	public static void main(String[] args) {
		System.out.println("sibu".charAt(10));
		try {
			System.out.println(10/5);
			//System.exit(1);
		}finally {
			System.out.println(" final");
		}
	}

}
// two condition where finally will not exeecuted  
   //i . system.exit
    // ii. above