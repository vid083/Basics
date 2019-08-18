package AUG_06;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		getSellingPrice(price);
	}

	public static void getSellingPrice(double price) {
		double selling_price, discount;
		if (price >= 0 && price < 10000) {
			discount = (price * 10) / 100;
			selling_price = price - discount;
			System.out.println("Selling price after discount : " + selling_price);
		} else if (price > 10000 && price < 20000) {
			discount = (price * 20) / 100;
			selling_price = price - discount;
			System.out.println("Selling price after discount : " + selling_price);
		} else {
			discount = (price * 25) / 100;
			selling_price = price - discount;
			System.out.println("Selling price after discount : " + selling_price);

		}

	}

}
