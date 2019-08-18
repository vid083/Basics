package AUG_13;
import java.util.Scanner;
public class arraysDemo {

	public static void main(String[] args) {
		float a[] = {8.3f, 5.6f, 7.8f};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		Scanner sc = new Scanner(System.in);
		float a1[] = new float[4];
		System.out.println("Enter array elements : ");
		
		for (int index = 0; index < 4; index++){
			System.out.println("a1["+index+"]=");
			a1[index]=sc.nextFloat();
		}
		double product = 1;
		System.out.println("Array Elemts :");
		for (int index =0; index<4; index++){
			System.out.println("a1["+index+"]="+a1[index]);
			product*=a1[index];
		}
		System.out.println("product="+product);
	}
	

}
