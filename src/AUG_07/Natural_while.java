package AUG_07;

import java.util.Scanner;

public class Natural_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = getSumOfNaturalNumbers(n);
		System.out.println("Sum of " + n + " natural numbers: " + sum);
	}

	public static int getSumOfNaturalNumbers(int n) {
		int sum = 0, i = 1; // Intialization
		while (i <= n) { // Condition
			sum = sum + i;
			i++; // iteration
		}
		return sum;

	}

}
