package AUG_02;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		float num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		num3 = sc.nextFloat();
		Average(num1, num2, num3);
	}

	public static void Average(float num1, float num2, float num3) {
		double average = (num1 + num2 + num3) / 3;
		System.out.println("Average of three numbers: " + average);
	}

}
