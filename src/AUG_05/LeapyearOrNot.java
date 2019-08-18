package AUG_05;

import java.util.Scanner;

public class LeapyearOrNot {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		boolean isLeap = isLeapYear(year);

		if (isLeap == true)
			System.out.println(year + "is leap year");
		else
			System.out.println(year + "is not leap year");
	}

	public static boolean isLeapYear(int year) {
		boolean isLeap = false;

		if (year % 100 == 0) {
			if (year % 400 == 0) {
				isLeap = true;
			} else {
				isLeap = false;
			}
		} else if (year % 4 == 0) {
			isLeap = true;
		} else {
			isLeap = false;
		}
		return isLeap;
	}
}
