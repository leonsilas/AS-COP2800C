package twoArray;
import java.util.Random;


public class Teefsies {

	public static void main(String[] args) {

	/*Style and main area with methods and declared array*/
		System.out.println("Thanks for using this jagged array randomizer!");
		System.out.println("");
		int [][] theTeef = new int[50][];
		randomizer(theTeef);
		printArray(theTeef);
		arrayStats(theTeef);
		
	}//end of main
	
	/*Sets array columns based on randomizer*/
	public static void randomizer(int[][] theTeef) {
		Random rand = new Random();
		
		//sets number of columns to make it jagged
		for (int row = 0; row < theTeef.length; row++) {
				int temp = rand.nextInt(20) + 1;
				theTeef[row] = new int[temp + 1]; //accounts for keeping initial 0 column
			
			//sets values and adds 1
			for (int col = 0; col < theTeef[row].length; col++) {
				theTeef[row][col] = temp; 
				temp++;
				
			}
		}	
		
	}//end of randomizer
	
	/*Basic output for the array*/
	public static void printArray (int[][] theTeef) {
		for (int row = 0; row < theTeef.length; row++) {
			for (int col = 0; col < theTeef[row].length; col++) {
				
				System.out.print(theTeef[row][col] + " ");
			}
			System.out.println("");
		}
	}//end of printArray

	/*Creates a running total and then calculates the average*/
	public static void arrayStats (int[][] theTeef) {
		System.out.println(" ");
		double arrayTotal = 0;
		int count = 0;
		for (int row = 0; row < theTeef.length; row++) {
			for (int col=0; col <theTeef[row].length; col++) {
				arrayTotal += (double) theTeef[row][col]; //total
				count++; //number for average
			}
		}
		
		//average
		double arrayAvg = arrayTotal / count;
		System.out.println("The sum of all the numbers in the array is: " + arrayTotal);
		System.out.println("The average of the numbers in the array is: " + arrayAvg);
	
	}//end of arrayStats
		
}//end of Teefsies
