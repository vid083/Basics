package (default package);

import java.util.Scanner;
public class TimeConversion {
	public static void main(String[] args){
		int minutes,years,hours,days;
		Scanner sc=new Scanner(System.in);
		minutes =sc.nextInt();
		years=minutes/525600;
		days=minutes/(24*60)%365;
		hours=minutes/60%24;
		minutes=minutes%60;
		System.out.println("Given minutes has " +(years) + "years " +(days) +"days" +"hours and " +(minutes) +" minutes ");
		
	}

}
