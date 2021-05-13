/********************************************************************************************************
 * Written By..: Leon Silas (Brieana McFarland)
 * Date Written: 27/08/20
 * Purpose.....: Show the effects of beer consumption. Includes caloric intake, money spent and quantity.
 ********************************************************************************************************/

package beerProject;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ChugChug {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00"); 
		
		//user inputs
		Scanner inObj = new Scanner(System.in);
		
		System.out.println("On average, how many beers will you consume each day?");
		float beerCans = inObj.nextFloat();
		
		System.out.println("On average, how much will you pay for each can of beer?");
		float beerCost = inObj.nextFloat();
		
		//How many beers will be consumed over the year
		float beerYear = beerCans * 365;
		//How many calories from beer alone (150 per can)
		float beerCalories = beerYear * 150;
		//How much weight expected to gain. (15 lbs per 365 12oz-cans a year)
		float beerWeight = beerCans * 15;
		//How much money will be spent over the year
		float beerTotal = beerYear * beerCost;
		
		//output
		System.out.println("That is approximately " + df.format(beerYear) + " beers in one year.");
		System.out.println("In one year, you will consume approximately " + df.format(beerCalories) + " calories from beer alone.");
		System.out.println("Without diet or exercise to counter these calories, you can expect to gain " + df.format(beerWeight) + " pounds from drinking that much beer this year.");
		System.out.println("You will also spend $" + df.format(beerTotal) + " on beer alone in one year.");
		
		//2 digit decimal values for all outputs
		
	} //end of main method

} //end of ChugChug class
