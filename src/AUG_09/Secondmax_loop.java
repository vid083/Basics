package AUG_09;

import java.util.Scanner;

public class Secondmax_loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getSecondMaxDigit(n);
		System.out.println("Second Max Digit of : " + getSecondMaxDigit(n));
	}

	public static int getSecondMaxDigit(int n) {
		int max = 0, secondMax = 0;

		for (; n > 0; n = n / 10) {
			int digit = n % 10;

			if (max < digit) {
				secondMax = max;
				max = digit;
			} else if (digit < max && digit > secondMax)
				secondMax = digit;
		}
		return secondMax;
	}

}
