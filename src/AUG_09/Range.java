//Write a program to  find the sum of all the numbers that are divisible by 3 or 5 in a given range of numbers.
//INPUT FORMAT :
//The first line contains the start integer, s. The second line contains the end integer ,e .
//Input :1   10
//Output : 33

//Input ;50  100
//Output : 1875
package AUG_09;

import java.util.Scanner;

public class Range {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int startrange = sc.nextInt();
		int endrange = sc.nextInt();
		System.out.println(getsum(startrange, endrange));
	}
	public static int getsum(int startrange, int endrange){
		int sum=0;
		for(int i=startrange; i<=endrange; i++){
			if(i% 3 == 0 || i % 5==0)
				sum=sum+i;
		}
		return sum;
	}

}
