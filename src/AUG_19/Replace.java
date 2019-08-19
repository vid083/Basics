package AUG_19;
import java.util.Scanner;
public class Replace {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				String str = sc.next();
				System.out.println(checkReplacing(str));
			}

			public static String checkReplacing(String str) {
				String result = "--#";
				str = str.replaceAll("[^abc]", "");
				result += str;

				return result;
			}
		}
