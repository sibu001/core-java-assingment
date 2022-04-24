package day6;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		double amount,intrest,rate,si,amt;
		int t;
		Scanner in = new Scanner (System.in);
		 
		
		for(int i=0;i<=1;i++) {
			System.out.println("enter loan amount:");
			amount= in.nextDouble();
			System.out.println("enter time");
			int time =in.nextInt();
			System.out.println("enter rate:");
			rate=in.nextDouble();
			si=(amount*rate*time/100);
			amt=(si+amount);
			System.out.println("simple intrest:"    +si);
			System.out.println("total amt:"          +amt);
			
		}
			
			
			
			
			
			
			
			
		}
			
		// TODO Auto-generated method stub

	}


