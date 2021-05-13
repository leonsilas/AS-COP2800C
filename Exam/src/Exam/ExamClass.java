package Exam;

/* This code takes into assumption of integers instead of any potential decimal values.  If this code were to be run with decimals in mind, then int values for highValue, lowValue, totalValue, and avgValue would need to be declared as float instead. */

import java.util.Scanner;

public class ExamClass {
	
	public static void main(String[] args) {
		
		//variable declaration 
		int i = 0, totalValue = 0, highValue = 0, avgValue = 0, lowValue = 0;
		
		//user inputs
		System.out.println("Please input your values.  Enter -999 to end your inputs.");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		//loop to determine if number is low/high and running totals
		while (userInput != -999) {
			
			if (i == 0) {
				lowValue = userInput;
				}
			else if (userInput < lowValue) {
				lowValue = userInput;
				}
			else if (userInput > highValue) {
				highValue = userInput;
				}
		
			//running totals and next userInput
			i++;
			totalValue += userInput;
			userInput = input.nextInt();
		
		}
		
		//calculate the average
		avgValue = totalValue / i;
		
		//outputs
		System.out.println("Highest Value " + highValue);
		System.out.println("Lowest Value " + lowValue);
		System.out.println("Average of Values " + avgValue);
		
		} //end of main method
	
} //end of ExamClass
