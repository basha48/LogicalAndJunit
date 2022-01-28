package JUnitTesting;

import java.util.Scanner;

import Utility.Utilitymethod;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the month: ");
		int m = scan.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date: ");
		int d = sc.nextInt();
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter The Year: ");
		int y = sn.nextInt();
		Utilitymethod.Dayofweek(m, d, y);
	}


}
