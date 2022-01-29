package JUnitTesting;

import java.util.Scanner;

import Utility.Utilitymethod;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Principle amount");
		double p=sc.nextDouble();
		System.out.println("Enter no of  years");
		double y=sc.nextDouble();
		System.out.println("Enter Rate of Intrest :");
		
		double r=sc.nextDouble();
		
		Utilitymethod.Monthlypayment(p, y, r);
	}
	
	
	
	
	
}
