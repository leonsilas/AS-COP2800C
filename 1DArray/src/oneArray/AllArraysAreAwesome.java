/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 27/09/20
 * Purpose.....: Show the use of arrays and sorting and searching through them.
 ********************************************************************************************************/

package oneArray;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class AllArraysAreAwesome {

	public static void main(String[] args) {
		
		//random and scanner declaration
		Random rand = new Random();
		Scanner userInput = new Scanner(System.in);
		
		//user input
		System.out.println("Please enter the amount of numbers you want to generate.");
		int numAmount = userInput.nextInt();
		
		//creates array with random numbers and prints
		System.out.println(" ");
		System.out.println("Here's your array.");
		int [] randomArray = new int[numAmount];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rand.nextInt(100) + 1;
			System.out.println(randomArray[i]);
		}
		
		//performs tasks for array
		sortArray(randomArray);
		System.out.println(" ");
		System.out.println("Select a number you wish to search for.");
		int numSearch = userInput.nextInt();
		searchArray(randomArray, numSearch);
		listNumbers(randomArray);
		arrayStats(randomArray);

	}//end of main
	
	static void sortArray(int [] randomArray) {
		System.out.println(" ");
		System.out.println("Here's your array sorted.");
		Arrays.sort(randomArray); //NOTE: I believe you could set this to an individual sorted array value to have both arrays stored for later. Such as with the search.
		for (int i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
		
	}//end of sortArray
	
	static void searchArray(int [] randomArray, int numSearch) {
		for (int i = 0; i < randomArray.length; i++) {
			if (randomArray[i] == numSearch) {
				System.out.println(" ");
				System.out.println(numSearch + " was found within the sorted array at position " + (i + 1));
				break;
			}
			
			else if (i == randomArray.length - 1) {
				System.out.println(" ");
				System.out.println(numSearch + " was not found within the sorted array.");
			}
			
		}
		
	}//end of searchArray

	static void listNumbers(int [] randomArray) {
		System.out.println(" ");
		System.out.println("Here's some information on the present numbers.");
	    int amount = 0;
	    int counter = 0; 
	    int move = 0;

        while(counter < randomArray.length){
            for (int i = 0; i < randomArray.length; i++){
                int currentInt = randomArray[counter];;
                if (currentInt == randomArray[i]) {
                	amount++;
                    move++;
                } 
            }
            
            //plural check for output
            if(amount == 1){
                System.out.println(randomArray[counter] + " was found " + amount + " time.");
            }   
            
            else {
        		System.out.println(randomArray[counter] + " was found " + amount + " times.");
            }
            
            //reset and move
            amount = 0;
            counter += move;
            move = 0;
        }
	}//end of listNumbers
	
	static void arrayStats(int [] randomArray) {
		System.out.println(" ");
		//average
		double arrayTotal = 0;
		for (int i = 0; i < randomArray.length; i++) {
			arrayTotal += (double) randomArray[i];
		}
		
		double arrayAvg = arrayTotal / randomArray.length;
		System.out.println("The average of the numbers in the array is: " + arrayAvg);
		
		//highest + lowest
		System.out.println("The lowest number is: " + randomArray[0]);
		System.out.println("The highest number is: " + randomArray[randomArray.length - 1]);
		
	}//end of arrayStats
	
}//end of AllArraysAreAwesome
