//WAP that counts the total number of words in a given text.
package AUG_16;
import java.util.Scanner;
public class Count_words {

	public static void main(String[] args) {
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string : ");
		
		str1 = sc.nextLine();
		System.out.println(str1);
		System.out.println("Number of words in string :" +getCount(str1));
	}
	public static int getCount(String str1){
		String[] words = str1.split(" ");
		return words.length;
	}

}
