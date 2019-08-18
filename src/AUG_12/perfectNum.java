//WAP to check if the given number is perfect number.

package AUG_12;

import java.util.Scanner;

public class perfectNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		getPerfectNum(n);
	}
	public static void getPerfectNum(int n){
		
		 int sum=0;
		 for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	        	 System.out.println(""+n+" is Perfect number " );
	        }
	        else
	        {
	            System.out.println(""+n+" is not Perfect number " );
	        }    
	}
}
