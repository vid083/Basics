package AUG_08;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(getSumOfDigits(num));
	}
	public static String getSumOfDigits(int num){
		String result = "";
		int sum = 0;
		if (num >= 10 && num<= 99);
			int digit1 = num % 10;
			int digit2 = num / 10;
			result = digit1 + digit2;
	}

	
else {
		result = 0;
	}
		return result;
 }
}