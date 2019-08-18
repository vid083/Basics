package AUG_17;

import java.util.Scanner;

public class SwapCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		System.out.println(getSwapCase(str));
	}

	public static String getSwapCase(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isAlphabetic(c)) {
				if (Character.isLowerCase(c))
					s = s + Character.toUpperCase(c);
				else
					s = s + Character.isLowerCase(c);
			} else {
				s += c;
			}

		}
		return s;
	}

}
