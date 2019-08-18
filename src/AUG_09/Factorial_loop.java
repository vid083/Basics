package AUG_09;

//WAP to print the factorial of a given number.
import java.util.Scanner;

public class Factorial_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getFactorial(n);
		System.out.println("Factorial of " +n+ " : " + getFactorial(n));
	}

	public static int getFactorial(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--
				) {
			fact = fact * i;
		}
		return fact;
	}
}
