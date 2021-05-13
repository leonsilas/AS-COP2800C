/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 21/10/20 EDITED: 26/10/20
 * Purpose.....: Show use of OOP in the context of Slot Machines to not only add slot machines and players, 
 * 	    		 but also keep track of variables within them while they gamble.
 ********************************************************************************************************/

package exam2;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		//declarations
		int choice = 0, selectedPlayer = 0, selectedMachine = 0;
		int i = 1, j = 3; //set to these to account for the preset machines/people in the array
		Player[] player = new Player[51];
		SlotMachine[] machine = new SlotMachine[50];
		Scanner userInput = new Scanner (System.in);
		
		//setting up defined players/machines
		player[0] = new Player( new Name("Uncle", "", "Charlie"), new DOB(1, 1, 1991), 1000000);
		
		machine[0] = new SlotMachine("Lucky 7", 5000, 1, 10000, 0, 5000, 10, 0, 5);
		machine[1] = new SlotMachine("Lucky Lotto", 55000, 1, 100000, 0, 75000, 50, 0, 25);
		machine[2] = new SlotMachine("Purple People Eater", 1000, 1, 50, 0, 40, 5, 0, 2);
		
		//core of main
		System.out.println("Welcome to the world famous Fabulous Las Vegas Nevada Casino!");
	
		//menu loop to continue until quit
		do {
			
			System.out.println("");
			System.out.println("What would you like to do?");
			System.out.println("1. Add A Player.");
			System.out.println("2. Add A Slot Machine.");
			System.out.println("3. Gamble.");
			System.out.println("4. Quit.");
			while (!userInput.hasNextInt()) {
				String trash = userInput.next();
				System.out.println("Sorry, but " + trash + " is not NUMBER from the menu.  Please choose a NUMBER.");
			}
			choice = userInput.nextInt();
			
			switch (choice) {
			
				case 1: //add player
					if (i < player.length) {
						player[i] = new Player();
						i++; //to move to next slot in array
					}
					
					else {
						System.out.println("Sorry, the max number of Players has been reached!");
					}
					break;
					
				case 2: //add slot machine
					if (j < machine.length) {
						machine[j] = new SlotMachine();
						j++; //to move to next slot in array
					}
					else {
						System.out.println("Sorry, the max number of Slot Machines has been reached!");
					}
					break;
					
				case 3: //gamble
					selectedPlayer = Player.selectPlayer(selectedPlayer, player, userInput);
					selectedMachine = SlotMachine.selectSlotMachine(selectedMachine, machine, userInput);

					//loop to continue gambling with same settings
					do {
						if (choice == 1) {
							if (player[selectedPlayer].getMoneyBalance() < 1) {
								System.out.println("Sorry! You no longer have enough money to play!");
								break;
							}
							
							if (machine[selectedMachine].getMachineBalance() < 1) {
								System.out.println("Sorry! This machine is out of order until it's refilled with money!");
								break;
							}
						}
			
						SlotMachine.gamble(selectedPlayer, player, selectedMachine, machine); 
						System.out.println("");
						System.out.println("Would you like to play again with the same settings?");
						System.out.println("1. Yes.");
						System.out.println("2. No.");
						while (!userInput.hasNextInt()) {
							String trash = userInput.next();
							System.out.println("Sorry, but " + trash + " is not NUMBER from the menu.  Please choose a NUMBER.");
						}
						choice = userInput.nextInt();
					} while  (choice == 1);
					break;
					
				case 4: //quit
					break;
					
				default: //invalid choice
					System.out.println("Sorry that is an invalid choice.  Please choose a valid option.");
			
			}//end switch
			
		} while (choice != 4);
		
		//final outputs
		System.out.println("");
		System.out.println("Thank you for choosing the world famous Fabulous Las Vegas Nevada Casino!");
		System.out.println("We hope to see you again soon!");

	}//end of main

}//end of TestClass
