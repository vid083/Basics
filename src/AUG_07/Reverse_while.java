package AUG_07;

import java.util.Scanner;

public class Reverse_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Reverse of number : " + reverseNumber(num));
	}

	public static String reverseNumber(int num) {
		int digit = 0;
		String rev = "";
		while (num > 0) {
			digit = num % 10;
			rev = rev + digit;
			num = num / 10;
		}
		return rev;
	}

}
