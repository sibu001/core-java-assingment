package day6;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i,j,k;
		System.out.println("enter no of row");
		i=in.nextInt();
		for(j=1;j<=i;j++) {
			for(k=1;k<=j;k++)
				System.out.print("*");
			System.out.println(" ");
		}
		// TODO Auto-generated method stub

	}

}
