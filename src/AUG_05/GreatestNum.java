package AUG_05;

import java.util.Scanner;

public class GreatestNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(getGreatestNum(num1, num2, num3) + " is greatest number");
	}

	public static int getGreatestNum(int num1, int num2, int num3) {
		int max = 0;

		if (max < num1)
			max = num1;

		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;

		return max;
	}
}
