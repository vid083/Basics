//WAP prime or not
package AUG_09;

import java.util.Scanner;

public class PrimeNum_loop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n + " is prime number : " + isPrime(n));
	}

	public static boolean isPrime(int n) {

		if (n == 2)
			return true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}
}
