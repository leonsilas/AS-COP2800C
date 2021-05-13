package exam2;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SlotMachine {
	
	//variables
	private String machineName;
	private int machineBalance;
	private int machineCost = 1; //setter was added for versatility despite scope defining it at 1
	private int jackpotRate;
	private int jackpotWins;
	private int jackpotPayout;
	private int regularRate;
	private int regularWins;
	private int regularPayout;
	private int i = 0;
	
	//constructors
	public SlotMachine(String machineName, int machineBalance, int machineCost, int jackpotRate, int jackpotWins,
			int jackpotPayout, int regularRate, int regularWins, int regularPayout) {
		super();
		setMachineName(machineName);
		setMachineBalance(machineBalance);
		setMachineCost(machineCost);
		setJackpotRate(jackpotRate);
		setJackpotWins(jackpotWins);
		setJackpotPayout(jackpotPayout);
		setRegularRate(regularRate);
		setRegularWins(regularWins);
		setRegularPayout(regularPayout);
	}
	
	public SlotMachine() {
		String message = "What is the slot machine name? ";
		machineName = JOptionPane.showInputDialog(message);
		setMachineName(machineName);
		
		message = "What is the machine's current balance?";
		try {
			i = 0;
			machineBalance = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setMachineBalance(machineBalance, i);
		
		message = "What is the machine's jackpot rate? [1 every ? plays]";
		try {
			i = 0;
			jackpotRate = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setJackpotRate(jackpotRate, i);
		
		message = "What is the machine's current number of jackpot wins?";
		try {
			i = 0;
			jackpotWins = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setJackpotWins(jackpotWins, i);
		
		message = "What is the machine's jackpot payout?";
		try {
			i = 0;
			jackpotPayout = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setJackpotPayout(jackpotPayout, i);
		
		message = "What is the machine's regular rate? [1 every ? plays]";
		try {
			i = 0;
			regularRate = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setRegularRate(regularRate, i);
		
		message = "What is the machine's current number of regular wins?";
		try {
			i = 0;
			regularWins = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setRegularWins(regularWins, i);
		
		message = "What is the machine's regular payout?";
		try {
			i = 0;
			regularPayout = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setRegularPayout(regularPayout, i);
	}
	
	
	//getters and setters
	public String getMachineName() {
		return machineName;
	}
	
	public void setMachineName(String machineName) {
		while (machineName.length() < 1) {
			String message = "What is the slot machine name? ";
			String error = "That's not a valid name!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			machineName = JOptionPane.showInputDialog(message);
		}
		
		this.machineName = machineName;
	}
	
	public int getMachineBalance() {
		return machineBalance;
	}
	
	public void setMachineBalance(int machineBalance) {
		while (machineBalance < 1 || i == 1) {
			String message = "What is the machine's current balance?";
			String error = "That's not a valid balance!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				machineBalance = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.machineBalance = machineBalance;
	}
	
	public void setMachineBalance(int machineBalance, int i) {
		while (machineBalance < 1 || i == 1) {
			String message = "What is the machine's current balance?";
			String error = "That's not a valid balance!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				machineBalance = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.machineBalance = machineBalance;
	}
	
	public int getMachineCost() {
		return machineCost;
	}
	
	public void setMachineCost(int machineCost) {
		while (machineCost < 1) {
			String message = "What is the machine's cost to play?";
			String error = "That's not a valid cost!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			machineCost = Integer.parseInt(JOptionPane.showInputDialog(message)); 		
		}
		
		this.machineCost = machineCost;
	}
	
	public int getJackpotRate() {
		return jackpotRate;
	}
	
	public void setJackpotRate(int jackpotRate) {
		while (jackpotRate < 0 || i == 1) {
			String message = "What is the machine's jackpot rate? [1 every ? plays]";
			String error = "That's not a valid rate!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				jackpotRate = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.jackpotRate = jackpotRate;
	}
	
	public void setJackpotRate(int jackpotRate, int i) {
		while (jackpotRate < 0 || i == 1) {
			String message = "What is the machine's jackpot rate? [1 every ? plays]";
			String error = "That's not a valid rate!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				jackpotRate = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.jackpotRate = jackpotRate;
	}
	
	public int getJackpotWins() {
		return jackpotWins;
	}
	
	public void setJackpotWins(int jackpotWins) {
		while (jackpotWins < 0 || i == 1) {
			String message = "What is the machine's current number of jackpot wins?";
			String error = "That's not a valid number of wins!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				jackpotWins = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.jackpotWins = jackpotWins;
	}
	
	public void setJackpotWins(int jackpotWins, int i) {
		while (jackpotWins < 0 || i == 1) {
			String message = "What is the machine's current number of jackpot wins?";
			String error = "That's not a valid number of wins!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				jackpotWins = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.jackpotWins = jackpotWins;
	}
	
	public int getJackpotPayout() {
		return jackpotPayout;
	}
	
	public void setJackpotPayout(int jackpotPayout) {
		while (jackpotPayout < 0 || i == 1) {
			String message = "What is the machine's jackpot payout?";
			String error = "That's not a valid payout!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				jackpotPayout = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			} 		
		}
		
		this.jackpotPayout = jackpotPayout;
	}
	
	public void setJackpotPayout(int jackpotPayout, int i) {
		while (jackpotPayout < 0 || i == 1) {
			String message = "What is the machine's jackpot payout?";
			String error = "That's not a valid payout!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				jackpotPayout = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			} 		
		}
		
		this.jackpotPayout = jackpotPayout;
	}
	
	public int getRegularRate() {
		return regularRate;
	}
	
	public void setRegularRate(int regularRate) {
		while (regularRate < 1 || i == 1) {
			String message = "What is the machine's regular rate? [1 every ? plays]";
			String error = "That's not a valid rate!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				regularRate = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			} 		
		}
		
		this.regularRate = regularRate;
	}
	
	public void setRegularRate(int regularRate, int i) {
		while (regularRate < 1 || i == 1) {
			String message = "What is the machine's regular rate? [1 every ? plays]";
			String error = "That's not a valid rate!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				regularRate = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			} 		
		}
		
		this.regularRate = regularRate;
	}
	
	public int getRegularWins() {
		return regularWins;
	}
	
	public void setRegularWins(int regularWins) {
		while (regularWins < 0 || i == 1) {
			String message = "What is the machine's current number of regular wins?";
			String error = "That's not a valid number of wins!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				regularWins = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.regularWins = regularWins;
	}
	
	public void setRegularWins(int regularWins, int i) {
		while (regularWins < 0 || i == 1) {
			String message = "What is the machine's current number of regular wins?";
			String error = "That's not a valid number of wins!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				regularWins = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.regularWins = regularWins;
	}
	
	public int getRegularPayout() {
		return regularPayout;
	}
	
	public void setRegularPayout(int regularPayout) {
		while (regularPayout < 0 || i == 1) {
			String message = "What is the machine's regular payout?";
			String error = "That's not a valid payout!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				regularPayout = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.regularPayout = regularPayout;
	}
	
	public void setRegularPayout(int regularPayout, int i) {
		while (regularPayout < 0 || i == 1) {
			String message = "What is the machine's regular payout?";
			String error = "That's not a valid payout!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				regularPayout = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}		
		}
		
		this.regularPayout = regularPayout;
	}
	
	//methods to do counts for machines
	public void addJackpotWin() {
		this.jackpotWins += 1;
		this.machineBalance += (machineCost - jackpotPayout);
	}
	
	public void addRegularWin() {
		this.regularWins += 1;
		this.machineBalance += (machineCost - regularPayout);
	}

	public void addLoss() {
		this.machineBalance += machineCost;
	}
	
	static int selectSlotMachine(int selectedMachine, SlotMachine [] machine, Scanner userInput) {
		int machineNum = 0;
		//prints out current machines
		System.out.println("");
		System.out.println("Here's a list of all the available slot machines!");
		for (SlotMachine i: machine) {
			if (i == null) {
				break;
			}
			System.out.println((machineNum + 1) + ". " + i);
			machineNum++;
		}
		
		//ensure a correct machine is selected
		do {
			System.out.println("");
			System.out.println("Which slot machine would you like to use?");
			selectedMachine = userInput.nextInt() - 1;
			
			if (selectedMachine > machineNum || selectedMachine < 0) {
				String error = "That's not a valid slot machine!";
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			}
			
			if (machine [selectedMachine].getMachineBalance() < 1) {
				String error = "That machine doesn't have enough money to play!";
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			}
		} while (selectedMachine > machineNum || selectedMachine < 0);
		
		System.out.println("You've chosen to play " + machine[selectedMachine].getMachineName() + "!");

		return selectedMachine;
		
	}//end selectSlotMachine
	
	static void gamble(int selectedPlayer, Player [] player, int selectedMachine, SlotMachine [] machine) {
		int payout = 0;
		Random rand = new Random();
		player [selectedPlayer].takeFee(); //take 1 dollar out per play
		
		//randomizer to see with machine odds if jackpot, regular, or nothing was hit
		int winningNum = rand.nextInt(machine [selectedMachine].getJackpotRate()) + 1;
		
		if (winningNum == rand.nextInt(machine [selectedMachine].getJackpotRate()) + 1) {			//unsure if the way I did this that the rates are really correct
			payout = machine [selectedMachine].getJackpotPayout();									//its possible I need to just pick one int to use as a check instead
		}
		
		else {
			winningNum = rand.nextInt(machine [selectedMachine].getRegularRate()) + 1;
			if (winningNum == rand.nextInt(machine [selectedMachine].getRegularRate()) + 1) {
				payout = machine [selectedMachine].getRegularPayout();
			}
		}
		
		//shows result and new balance
		System.out.println("");
		if (payout > 0) {
			//printout and adjustment for jackpot
			if (payout == machine [selectedMachine].getJackpotPayout()) {
				System.out.println("JACKPOT!! You won $" + payout + "!");
				machine [selectedMachine].addJackpotWin(); //add one to jackpot wins and adjust balance
			}
			else {
				//printout and adjustment for regular win
				System.out.println("You won $" + payout + "!");
				machine [selectedMachine].addRegularWin(); //add one to regular wins and adjust balance
			}
			
			player[selectedPlayer].addWinnings(payout); //adds winnings to current balance
		}
		//printout for loss
		else {
			System.out.println("Sorry, you didn't win this time!");
			machine [selectedMachine].addLoss();
		}
		
		//new balance printout
		System.out.println(player[selectedPlayer].getName() + " has a new balance of $" + player[selectedPlayer].getMoneyBalance());
	
	}//end gamble
	
	//toString
	@Override
	public String toString() {
		return  machineName + " Balance: $" + machineBalance + " Cost: $"
				+ machineCost + " Jackpot Rate: 1 in every " + jackpotRate + " games. Current number of Jackpot Wins: " + jackpotWins + " Jackpots pay out: $"
				+ jackpotPayout + " Regular Rate: 1 in every " + regularRate + " games.  Current number of Regular Wins: " + regularWins + " Regular wins pay out: $"
				+ regularPayout;
	}

}//end of SlotMachine


