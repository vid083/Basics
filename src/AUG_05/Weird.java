package AUG_05;

import java.util.Scanner;

public class Weird {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(weirdornot(n));
	}

	public static String weirdornot(int n) {
		String result = "";
		if (n % 2 == 0) {
			if (n >= 2 && n <= 5) {
				result = "Not Weird";
			}
			if (n >= 6 && n <= 20) {
				result = "Weird";
			} else if (n > 20) {
				result = "Not Weird";
			}
		}

		else {
			result = "Weird";
		}
		return result;
	}

}
