package dataypes_variables;

import java.util.Scanner;

public class MethodsDemo {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		Addition(num1, num2);
		Substraction(num1, num2);
		Multiplication(num1, num2);
		Division(num1, num2);
		Modulodivision(num1, num2);
	}

	public static void Addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum = " + sum);
	}

	public static void Substraction(int num1, int num2) {
		int Sub = num1 - num2;
		System.out.println("Sub = " + Sub);
	}

	public static void Multiplication(int num1, int num2) {
		int Mul = num1 * num2;
		System.out.println("Mul = " + Mul);
	}

	public static void Division(int num1, int num2) {
		int Div = num1 / num2;
		System.out.println("Div = " + Div);
	}

	public static void Modulodivision(int num1, int num2) {
		int Mod = num1 % num2;
		System.out.println("Mod = " + Mod);
	}
}