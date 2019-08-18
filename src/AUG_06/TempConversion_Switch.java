package AUG_06;

import java.util.Scanner;

public class TempConversion_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice(ch):");
		int ch = sc.nextInt();

		getTemperatureConversion(ch);
	}

	public static void getTemperatureConversion(int ch) {
		Scanner sc = new Scanner(System.in);
		float temp;
		switch (ch) {
		case 0:
			System.out.println("\nEnter Fahrenhieit temperature");
			temp = sc.nextFloat();
			double celsius = ((temp - 32) / 1.8);
			System.out.println("\nCelsius Temperature :" + celsius);
			break;
		case 1:
			System.out.println("\nEnter Celsius temperature");
			temp = sc.nextFloat();
			double Fahrenheit = ((temp * 1.18) + 32);
			System.out.println("\nFahrenheit Temperature :" + Fahrenheit);
			break;
		default:
			System.out.println("Please enter vaild input(0,1)");
		}
	}

}
