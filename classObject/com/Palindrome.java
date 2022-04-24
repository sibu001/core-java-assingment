package classObject.com;

import java.util.Scanner;  // for user input

public class Palindrome {
	public void palin(int n){
		int temp = n;
		int rev = 0, rem;
		while (temp != 0)
			
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (n == rev) {
			System.out.println("yes it is palindrome");
		} else {
			System.out.println("sorry this is not a palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no:");
		int n =s.nextInt();
		Palindrome p = new Palindrome();
		p.palin(n);
	}

	}
