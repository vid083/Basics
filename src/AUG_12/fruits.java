package AUG_12;

import java.util.Scanner;

public class fruits {
	public static void main(String[] args){
		getCombinations(0.5f,1,5);
	}
	public static void getCombinations(float bananaCost, int orangesCost, int applesCost){
		 int count = 0; 
		 for(int bananas=1; bananas<=100; bananas++)
		 for(int oranges=1; oranges<=100; oranges++)
		 for(int apples=1; apples>=1; apples++){
			 float totalcost = (bananas * bananaCost) + (oranges * orangesCost) + (apples * applesCost);
			 int No_Of_Fruits = bananas + oranges + apples;
	if(No_Of_Fruits == 100 && totalcost==100){
		count ++;
	        	 System.out.println("bananas= "+bananas+",");
	        	 System.out.println("oranges="+oranges+",");	
	        	 System.out.println("apples = "+apples+",");			
	        	 System.out.println("Cost ="+totalcost+",");
	        }
		 }
	}
}


