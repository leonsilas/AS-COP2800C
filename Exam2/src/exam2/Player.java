package exam2;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Player {

	//variables
	private Name name;
	private DOB birthday;
	private int moneyBalance;
	private int i = 0;
	
	//constructor
	public Player(Name name, DOB birthday, int moneyBalance) {
		setName(name);
		setBirthday(birthday);
		setMoneyBalance(moneyBalance);
	}
	
	public Player() {
		createPlayer();
	}

	public void createPlayer() {
		setName(new Name());
		
		setBirthday(new DOB());
		
		String message = "What is your current balance?";
		try {
		moneyBalance = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setMoneyBalance(moneyBalance , i);
	}
	
	//getters and setters
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public DOB getBirthday() {
		return birthday;
	}

	public void setBirthday(DOB birthday) {
		this.birthday = birthday;
	}

	public int getMoneyBalance() {
		return moneyBalance;
	}

	public void setMoneyBalance(int moneyBalance) {
		while (moneyBalance < 0 || i == 1) {
			String message = "What is the current balance?";
			String error = "That's not a valid balance!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				moneyBalance = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.moneyBalance = moneyBalance;
	}
	
	public void setMoneyBalance(int moneyBalance, int i) {
		while (moneyBalance < 0 || i == 1) {
			String message = "What is the current balance?";
			String error = "That's not a valid balance!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				moneyBalance = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.moneyBalance = moneyBalance;
	}
	
	//methods to do counts for players
	public void takeFee() {
		this.moneyBalance -= 1; //this would be changed later if scope included different fees for machines
	}
	
	public void addWinnings(int payout) {
		this.moneyBalance += payout;
	}
	
	static int selectPlayer(int selectedPlayer, Player [] player, Scanner userInput) {
		int playerNum = 0;
		//prints out current players
		System.out.println("");
		System.out.println("Here's a list of all the available players!");
		for (Player i: player) {
			if (i == null) {
				break;
			}
			System.out.println((playerNum + 1) + ". " + i);
			playerNum++;
		}
		
		//ensure a correct player is selected
		do {
			System.out.println("");
			System.out.println("Which player would you like to use?");
			selectedPlayer = userInput.nextInt() - 1;
			
			if (selectedPlayer > playerNum || selectedPlayer < 0) {
				String error = "That's not a valid player!";
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			}
			
			if (player [selectedPlayer].getMoneyBalance() < 1) {
				String error = "That player doesn't have enough money to play!";
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			}
			
		} while (selectedPlayer > playerNum || selectedPlayer < 0 || player [selectedPlayer].getMoneyBalance() < 1);
		
		//shows current balance of player selected
		System.out.println("");
		System.out.println(player[selectedPlayer].getName() + " has a balance of $" + player[selectedPlayer].getMoneyBalance());
				
		return selectedPlayer;
		
	}//end selectPlayer

	//toString
	@Override
	public String toString() {
		return name + " born on " + birthday + ", has a balance of $" + moneyBalance;
	}
	
}//end of Player
