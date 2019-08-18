package dataypes_variables;

import java.util.Scanner;

public class DatatypesDemo {
	public static void main(String arg[]) {
		// Declaration: datatype variablename;
		int a;
		float b;
		char c;
		double d;
		Scanner sc = new Scanner(System.in);
		// Intialization : variableName = value;
		System.out.println("enter input:");
		a = sc.nextInt();
		b = sc.nextFloat();
		c = 'a';
		d = sc.nextDouble();

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);

	}
}
