package AUG_06;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Classes Held: ");
		float classesHeld = sc.nextFloat();
		System.out.print("Classes Attended: ");
		float classesAttended = sc.nextFloat();

		double percentage = getPercentage(classesHeld, classesAttended);
		System.out.println("Attendence Percentage : " + percentage);

		if (percentage >= 75)
			System.out.println("Allowed to sit in exam");
		else
			System.out.println("Not allowed to sit in exam");
	}

	public static double getPercentage(float classesHeld, float classesAttended) {
		double percentage = (classesAttended / classesHeld) * 100;
		return percentage;
	}
}
