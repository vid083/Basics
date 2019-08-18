package AUG_12;
import java.util.Scanner;
public class Min {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		System.out.println(getminNum(num1, num2, num3, num4) + " is minimum number");
	}

	public static int getminNum(int num1, int num2, int num3, int num4) {
		int min = num1;

		if (min > num1)
			min = num1;

		if (min > num2)
			min = num2;
		
		if (min > num3)
			min = num3;
		
		if (min > num4)
			min = num4;

		return min;
		
	}

}
