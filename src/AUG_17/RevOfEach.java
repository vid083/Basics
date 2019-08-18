package AUG_17;

import java.util.Scanner;

public class RevOfEach {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		
		String[] words = str.split(" ");
		String reverse = "";
		for (int i=0; i<str.length();i++){
			reverse += getReverse(words[i]) + " ";
		}
		
		System.out.println(reverse);
		
	}
	public static String getReverse(String word){
		String result = "";
		for (int i=word.length()-1;i>=0;i--){
			result +=word.charAt(i);
		}
		return result;
		}
}
