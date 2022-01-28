package Utility;

public class Utilitymethod {
	
	
	public static void Dayofweek(int m,int d,int y) {
		int tempY,tempM,tempD,x;
				tempY = y -(14 - m) / 12;
				x = tempY + tempY/4 - tempY/100 + tempY/400;
				tempM = m + 12 * ((14 - m) / 12) - 2;
				tempD = (d + x + 31 * tempM / 12) % 7 ;
				System.out.println("Day of the week (Sunday=0;Monday=1;Tuesday=2;Wednesday=3;Thursday=4;Friday=5;Saturday=6)" + tempD);
	}
	
	
	public static void Temperatureconversion(int tempValue,int tempUnit) {
		int conv1,conv2;
		switch (tempUnit) {
		case 1:
			conv1 = (tempValue * 9/5) + 32; 
			System.out.println("Celsius to Fahrenheit: " + conv1);
			break;
		case 2:
			 conv2 = (tempValue - 32) * 5/9;
				System.out.println("Fahrenheit to Celsius: " + conv2);
			break;
		default:
		}
	}
	
	public static void Monthlypayment(double p,double y,double r) {
		double n,R;
		double payment;
		n=12*y;
		R=(r/12)*100;
		payment = (p*R) / 1 - (Math.pow((1+R),(-n)));
		System.out.println("The payment that has to be done will be: " + payment);
	}
	
	
	
	
	

}
