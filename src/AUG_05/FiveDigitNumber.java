package AUG_05;

import java.util.Scanner;

public class FiveDigitNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(getFiveDigitNumber(num));
	}

	public static String getFiveDigitNumber(int num) {

		String result = "";

		if (num >= 10000 && num < 100000) {
			result = num + "is a five digit number";
		} else {
			result = num + "is not a five digit number";
		}
		return result;
	}
}
