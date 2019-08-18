package AUG_06;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		int Maths, Phy, Chem;
		Scanner sc = new Scanner(System.in);
		Maths = sc.nextInt();
		Phy = sc.nextInt();
		Chem = sc.nextInt();

		StudentGrade(Maths, Phy, Chem);
	}

	public static void StudentGrade(int Maths, int Phy, int Chem) {
		float Total, Percentage;
		Total = Maths + Phy + Chem;
		Percentage = (Total / 300) * 100;
		if (Percentage >= 90) {
			System.out.println("Grade = A");
		} else if (Percentage >= 70 && Percentage < 90) {
			System.out.println("Grade = B");
		} else if (Percentage >= 50 && Percentage < 70) {
			System.out.println("Grade = C");
		} else if (Percentage < 50) {
			System.out.println("Grade = F");
		}
	}

}
