/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 11/10/20  MODIFIED: 18/10/20
 * Purpose.....: Show the basic uses of OOP.
 ********************************************************************************************************/

package firstOOP;
import java.util.Scanner;

public class OnlyOneProblem {

	public static void main(String[] args) {
		
		//variables
		int selection = 0;
		Scanner userInput = new Scanner(System.in);
		

/*create and populate 3+ people*/
		
		//Loop to generate people
		System.out.println("How many people would you like to generate?");
		int numPeople = userInput.nextInt();
		Person[] people = new Person[numPeople];
		for (int i = 0; i < numPeople; i++) {
			people[i] = new Person();
		}
		//separate loop to reprint out
		System.out.println("");
		System.out.println("These " + numPeople + " people have been randomly generated.");
		printPeople(numPeople, people);
		
		
/*allow user to change the fields for the person*/
		System.out.println("");
		System.out.println("Would you like to change any information for these " + numPeople + " people?");
		System.out.println("1. Yes");
		System.out.println("2. No");

		//loop for changing information
		int choice = 0;
		choice = userInput.nextInt();
		do {
			//if the user wants to change info
			if (choice == 1) {
				
				//do allows for multiple people to be changed
				do {
				
					System.out.println("Alright, which person would you like to change?");
					
					//makes sure that the selection is within the array size
					do {
						
						selection = userInput.nextInt();
						
						if (selection <= 0 || selection > people.length) {
							System.out.println("That is an invalid selection.  Please try again.");
						}
						
						else {
							people[selection - 1].changeSpawn(selection);
						} 
						
					}while (selection < 1 || selection > people.length);
				
				//prompt to see if loop continues
				System.out.println("Would you like to change another person?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choice = userInput.nextInt();
				
				} while (choice == 1);
				
			}//end if
			
			//if the user doesn't want to change info
			else if (choice == 2) {
				System.out.println("Alright, let me get the information for these people printed out for you!");
				break;
			}
			
			//incorrect input
			else {
				System.out.println("Sorry I didn't quite get that...");
				System.out.println("Would you like to change any infomation for these people?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choice = userInput.nextInt();
			}
		} while (choice != 1 || choice != 2);
		
/*output the 3 people*/
		for (int i = 0; i < numPeople; i++) {
			System.out.println("");
			System.out.println(people[i]);
		}
	
		
	}//end of main

	public static void printPeople (int numPeople, Person [] people) {
		for (int i = 0; i < numPeople; i++) {
			System.out.println("");
			System.out.println(people[i]);
		}
	}
}//end of OnlyOneProblem
