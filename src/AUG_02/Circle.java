package AUG_02;

import java.util.Scanner;

public class Circle {
	public static void main(String arg[]) {
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		radius = sc.nextDouble();
		
		Area(radius);
		Perimeter(radius);
		Diameter(radius);
	}

	public static void Perimeter(double radius) {
		double per = 2 * 3.14 * radius;
		System.out.println("perimeter of circle :" + per);
	}

	public static void Area(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("area of circle :" + area);
	}
	public static void Diameter(double radius){
		double diameter = 2 * radius;
		System.out.print("diameter of circle :" + diameter);
	}
	
}