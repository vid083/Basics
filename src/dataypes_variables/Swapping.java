package dataypes_variables;

import java.util.Scanner;

public class Swapping {
	public static void main(String arg[]) {
		int temp;
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
