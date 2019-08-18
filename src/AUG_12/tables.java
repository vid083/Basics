package AUG_12;
import java.util.Scanner;
public class tables {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of tables to be printed :");
		int n = sc.nextInt();
		tables(n);
	}
	public static void tables(int n){
		for(int t=1; t<=n; t++){
			for (int i=1; i<=10; i++) {
				System.out.println(t+"*"+ i+ "="+(t*i));
			}
			System.out.println("----------------");
		}
	}

}
