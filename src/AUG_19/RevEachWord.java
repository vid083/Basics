package AUG_19;
import java.util.Scanner;
public class RevEachWord {
	 public static void main(String[] args) {
	        String str1;
	        Scanner sc = new Scanner(System.in);
	        str1 = sc.nextLine();

	        String[] words = str1.split(" ");
	        String reverse = "";
	        	for(int i = 0;i<words.length;i++){
	        		reverse +=getReverse(words[i]+" ");
	        	}
	        	System.out.println(reverse);
	 		}
	 		public static String getReverse(String word){
	 			String result="";
	 			for(int i = word.length()-1; i>=0;i--){
	 				result += word.charAt(i);
	 				}
	 				return result;
	 		}
	}

