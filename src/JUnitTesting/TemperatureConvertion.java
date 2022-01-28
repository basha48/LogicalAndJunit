package JUnitTesting;

import java.util.Scanner;

import Utility.Utilitymethod;

public class TemperatureConvertion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature value");
		int tempValue = scan.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter from option: 1)Celsius to Fahrenheit 2)Fahrenheit to Celsius:");
		int tempUnit = sc.nextInt();
		Utilitymethod.Temperatureconversion(tempValue, tempUnit);

	}


}
