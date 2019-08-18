package dataypes_variables;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("sum = " + (x / 10 + x % 10));
		System.out.println("difference = " + (x / 10 - x % 10));

	}
}
