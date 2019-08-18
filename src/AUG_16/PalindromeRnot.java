
package AUG_16;
import java.util.Scanner;
public class PalindromeRnot {
	public static void main(String[] args){
		String str1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter palindrome: ");
		str1 = sc.nextLine();
		System.out.println("palindrome is :" +getPalindrome(str1));
	}
	public static boolean getPalindrome(String str1){
		String rev = "";
		for (int i=str1.length()-1;i>=0;i--){
			rev +=str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(rev)){
			return true;
		}
		return false;
		
			

	}

}
