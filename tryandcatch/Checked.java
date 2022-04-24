package tryandcatch;

import java.io.*;

public class Checked {
	public static void main(String[] args) {
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			System.out.println(e);

		}
		System.out.println("rest");
	}

}
// for checked exception both exception must be present in body 
// for unchecked it may or may not present