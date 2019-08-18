package AUG_12;

import java.util.Scanner;

public class product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(getProductOfDigits(num) + " is the product");

	}

	public static int getProductOfDigits(int num) {

		int product;
		if (num >= 10 && num <= 99)
			;
		int digit1 = num % 10;
		int digit2 = num / 10;
		product = digit1 * digit2;
		return product;
	}

}
