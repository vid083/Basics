package AUG_09;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		getOperations(num1, num2);
	}

	public static void getOperations(int num1, int num2) {
		boolean flag = false;
		do {

			System.out.println(
					"menu: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Remainder \n 6.Power");
			System.out.println("Enter option : ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Addition of" + num1 + "," + num2 + " : " + (num1 + num2));
				break;
			case 2:
				int sub = 0;
				if (num1 > num2)
					sub = num1 - num2;
				else
					sub = num2 - num1;
				System.out.println("Subtraction of" + num1 + "," + num2 + " : " + (num1 - num2));
				break;
			case 3:
				int mul = num1 * num2;
				System.out.println("Multiplication of" + num1 + "," + num2 + " : " + (num1 * num2));
				break;
			case 4:
				int div = 0;
				if (num1 > num2)
					div = num1 / num2;
				else
					div = num2 / num1;
				System.out.println("Division of" + num1 + "," + num2 + " : " + (num1 / num2));
			case 5:
				int rem = 0;
				if (num1 > num2)
					rem = num1 % num2;
				else
					rem = num1 % num2;
				System.out.println("Remainder of" + num1 + "," + num2 + " : " + (num1 % num2));
			case 6:
				int power = 1, count = 0;
				while (count <= num2)
					; {
				power *= num1;
				count++;
			}
				System.out.println("power of the number : " + power);
				break;
			default:
				System.out.println("Invaild Input..");
			}
			System.out.println("Do you want continue[true/false] :");
			flag = sc.nextBoolean();
		} while (flag);

	}
}
