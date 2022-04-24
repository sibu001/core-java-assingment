package classObject.com;
import java.util.Scanner;

class evenodd{
	void show(int n) {
		if(n%2==0) {
			System.out.println("even");}
			else {
				System.out.println("odd");}
			}
		//void show(int a,String s) {
		//	System.out.println("bang bang");
	//	}
			
		}
public class PolyOverLoading {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no:");
		int n =s.nextInt();
		evenodd e = new evenodd();
		e.show(n);
		
	
	
}
}

