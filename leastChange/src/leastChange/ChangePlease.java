/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 12/09/20
 * Purpose.....: Calculate the least amount of coins needed to make change for a random change amount.
 ********************************************************************************************************/

package leastChange;
import java.util.Random;

public class ChangePlease {
	
	public static void main(String[] args) {
		
		//Variable Declaration
		int numHDollar = 0;
		int numQuarter = 0;
		int numDime = 0;
		int numNickel = 0;
		int numPenny = 0;
		String HDollar = "Half Dollar";
		String Quarter = "Quarter";
		String Dime = "Dime";			
		String Nickel = "Nickel";
		String Penny = "Penny";
		String finalOutput = "You were given: ";
		Random rand = new Random();
		
		//Loop and Randomizer
		for (int i = 0; i < 5; i++) {
			int randomCoin = rand.nextInt(100);
			
			//Output Change
			System.out.println("This is the amount of change you have is " + randomCoin + " cents.");
	
			//Coin Calculation + Plural Changes
			if (randomCoin / 50 != 0) {
				numHDollar = randomCoin / 50;
				randomCoin -= numHDollar * 50;
					/*if (numHDollar > 1) {
						HDollar = "Half Dollars"; Omitted due to change being limited to 99, but could be used if amount was changed.
					}*/
					
					if (numHDollar >= 1) {
						finalOutput += numHDollar + " " + HDollar + " ";
					}
			}
			
			if (randomCoin / 25 != 0) {
				numQuarter = randomCoin / 25;
				randomCoin -= numQuarter * 25;
					/*if (numQuarter > 1) {
						Quarter = "Quarters"; Omitted due to the addition of Half Dollars.
					}*/
					
					if (numQuarter >= 1) {
						finalOutput += numQuarter + " " + Quarter + " ";
					}
			}
			
			if (randomCoin / 10 != 0) {
				numDime = randomCoin / 10;
				randomCoin -= numDime * 10;
					if (numDime > 1) {
						Dime = "Dimes";
					}
					
					if (numDime >= 1) {
						finalOutput += numDime + " " + Dime + " ";
					}
			}
			
			if (randomCoin / 5 != 0) {
				numNickel = randomCoin / 5;
				randomCoin -= numNickel * 5;
					/*if (numNickel > 1) {
						Nickel = "Nickels"; Omitted due to Dimes.
					}*/
					
					if (numNickel >= 1) {
						finalOutput += numNickel + " " + Nickel + " ";
					}
			}
			
			if (randomCoin / 1 != 0) {
				numPenny = randomCoin * 1;
					if (numPenny > 1) {
						Penny = "Pennies";
					}
					
					if (numPenny >= 1) {
						finalOutput += numPenny + " " + Penny + " ";
					}
			}
		
			//Output
			System.out.println(finalOutput);
			
			//Variable Reset for loop
			numHDollar = 0;
			numQuarter = 0;
			numDime = 0;
			numNickel = 0;
			numPenny = 0;
			HDollar = "Half Dollar";
			Quarter = "Quarter";
			Dime = "Dime";			
			Nickel = "Nickel";
			Penny = "Penny";
			finalOutput = "You were given: ";
		}//End of loop
		
	} //End of main method

}//End of ChangePlease class
