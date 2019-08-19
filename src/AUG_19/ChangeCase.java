package AUG_19;
import java.util.Scanner;
public class ChangeCase {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 System.out.println(getSwapCase(str));
		 }

		 	public static String getSwapCase(String str) {
		 		String s = "";
		 		for (int i = 0; i < str.length(); i++) {
		 			char c = str.charAt(i);
		 			if (Character.isAlphabetic(c)) {

		 					if (Character.isLowerCase(c))
		 						s = s + Character.toUpperCase(c);
		 					else
		 						s = s + Character.toLowerCase(c);
		 			} else {
		 				s += c;
		 			}
		 		}
		 		return s;
		     }
		     
		 }

