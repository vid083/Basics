package AUG_19;

public class OddPalindromes01 {
	public static void main(String[] args) {
		int num1 = 1500;
		int num2 = 2000;
		System.out.println(generateOddPalindromes(num1, num2));
	}

	public static String generateOddPalindromes(int start, int limit) {
		String result = "";
		if (start <= 0 || limit <= 0)
			return "-1";
		else if (start >= limit)
			return "-2";
		else {
			for (int num = start; num <= limit; num++) {
				if (isPalindrome(num) && isAllDigitsOdd(num))
					result += num + ",";
			}
			int length = result.length();
			if (length == 0)
				return "-3";
		}
		result = result.substring(0, result.length() - 1);
		return result;
	}

	public static boolean isPalindrome(int num) {
		int reverse = reverse(num);
		if (num == reverse)
			return true;

		return false;
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;

	}

	public static boolean isAllDigitsOdd(int num) {
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0 || digit == 0)
				return false;
			num = num / 10;
		}
		return true;
	}
}
