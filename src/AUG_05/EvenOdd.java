package AUG_05;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println(getEvenOdd(num));
	}

	public static String getEvenOdd(int n) {
		String result = "";

		if (n % 2 == 0) {
			result = n + " is even number";
		} else {
			result = n + " is odd number";
		}
		return result;
	}
}