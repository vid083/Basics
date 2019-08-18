package dataypes_variables;

import java.util.Scanner;

public class ArithmaticOperations {
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputs");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quot = num1 / num2;
		int rem = num1 % num2;
		System.out.println("sum = " + sum);
		System.out.println("difference = " + difference);
		System.out.println("product = " + product);
		System.out.println("quot = " + quot);
		System.out.println("rem = " + rem);
	}
}