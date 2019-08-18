package AUG_12;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines to be printed :");
		int n = sc.nextInt();
		getPattern(n);
	}
	public static void getPattern(int n){
		for(int i=1; i<=n; i++){
			for (int j=1; j<=i; j++) {
				System.out.print(j+"");
			}
			System.out.println();

		}
	}
}