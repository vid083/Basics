package AUG_16;
import java.util.Scanner;
public class ReverseOfString {
	public static void main(String[] args){
		String str1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		str1 = sc.nextLine();
		
		System.out.println("str1 : " +str1);
		System.out.println("reverse of given string : " +getReverse(str1));
	}
	public static String getReverse(String str1){
		String rev = "";
		for (int i=str1.length()-1;i>=0;i--){
			rev +=str1.charAt(i);
		}
		return rev;
	}
}
