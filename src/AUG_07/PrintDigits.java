package AUG_07;

import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Digits in number :");
	}

	public static int getSumOfEvenNumbers(int n) {
		int digit = 0;
		while (n > 0) {
			digit = n % 10;
			System.out.println(digit);
			n = n / 10;
		}
		return digit;
	}

}
