package AUG_02;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		int min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of minutes:");
		min = sc.nextInt();		
		Time(min);	

	}
	public static void Time(int min){
		 int years = min / 525600;
		 int days = min / (24 * 60) % 365;
		 int hours = min / 60 % 24;
		 int minutes = min % 60;
		System.out.println("Given minutes has " + (years) + " years " + (days) + " days " + (hours) + " hours and "
				+ (minutes) + " minutes ");
	}

}
