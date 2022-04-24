package tryandcatch;
import java.util.*;
public class Demo3 {
	public static void main(String[] args) {
		try {Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		      int num= s.nextInt();
			int[] a = new int[10];
			a[num] = 100;
			System.out.println(a[2]);
			System.out.println(10 /num);
			System.out.println("sibu".charAt(8));
		} catch (Exception e) {
			// catch(IndexOutOfBoundsException |ArithmeticException ae) {
			System.out.println(" abe zero ni likhna hai");
			//System.out.println(10 / 5);
			//e.printStackTrace();
		}

	}

}
// if indexout is not present then java.lang.StringIndexOutOfBoundsException this error is generated//