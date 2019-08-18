package AUG_07;

import java.util.Scanner;

public class Even_whie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of " + n + " even Natural Numbers: " + getSumOfEvenNumbers(n));
	}

	public static int getSumOfEvenNumbers(int n) {
		int sum = 0, i = 2; // Intialization
		while (i <= n) { // Condition
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++; // iteration
		}
		return sum;

	}

}
