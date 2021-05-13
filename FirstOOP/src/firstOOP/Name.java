package firstOOP;
import java.util.Random;
import javax.swing.JOptionPane;


public class Name {
	//variables
	private String firstName;
	private String middleName;
	private String lastName;

	//random arrays for each
	private String [] randomFirstNames = new String [] {"Llyr", "Serene", "Lionel", "Sen", "Shura", "Ren", "Blake", "Claudia", "Aeron", "Therian", "Lorelei"};
	private String [] randomMiddleNames = new String [] {"Artemius", "Legh", "Avalon", "Enyd", "Laine", "Morgan", "Nora", "Ivy", "Iris", "Genevieve", "Freya"};
	private String [] randomLastNames = new String [] {"Octavius", "Ashur", "Villiers", "Westgard", "Benevous", "Carnot", "Ramsden", "Castellianos", "Sylas", "Cordelia", "Calabraba"};
	
	//constructor
	public Name(String firstName, String middleName, String lastName) {
		super();
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}

	//used to construct random or set Name
	public Name(boolean randomIndicator) {
		if (randomIndicator) {
			String message = "What is your first name: ";
			firstName = JOptionPane.showInputDialog(message);
			firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);     //these ensure sentence case for the names
			message = "What is your middle name: ";
			middleName = JOptionPane.showInputDialog(message);
			middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1);  //these ensure sentence case for the names
			message = "What is your last name: ";
			lastName = JOptionPane.showInputDialog(message);
			lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);        //these ensure sentence case for the names
			setFirstName(firstName);
			setMiddleName(middleName);
			setLastName(lastName);
		}
		
		else {
		setFirstName(randomFirstName());
		setMiddleName(randomMiddleName());  //randomizes
		setLastName(randomLastName());
		}
	}

	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//toString
	@Override
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	//sets random first, middle, and last name
	public String randomFirstName () {
		Random rand = new Random();
		int temp = rand.nextInt(11);
		String randomFirstName = randomFirstNames[temp];
		return randomFirstName;
	}
	
	public String randomMiddleName() {
		Random rand = new Random();
		int temp = rand.nextInt(11);
		String randomMiddleName = randomMiddleNames[temp];
		return randomMiddleName;
	}
	
	public String randomLastName () {
		Random rand = new Random();
		int temp = rand.nextInt(11);
		String randomLastName = randomLastNames[temp];
		return randomLastName;
	}

}//end of Name
