package AUG_17;
import java.util.Scanner;
public class StringDetails {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string : ");
			String str = sc.nextLine();
			getDetails(str);
		}

		public static void getDetails(String str) {
			str = str.toLowerCase();
			int vowels = 0, consonants = 0, digits = 0, symbols = 0;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if (Character.isAlphabetic(c)) {
				
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
						vowels++;
					}else{
						consonants++;
					}
						
				} else if (Character.isDigit(c)) {
					digits++;
				}else
					symbols++;
				}
				System.out.println("vowels: " +vowels);
				System.out.println("consonants: " +consonants);
				System.out.println("digits: " +digits);
				System.out.println("symbols: " +symbols);

			}
		
		}


