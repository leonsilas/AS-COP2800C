package exam2;
import javax.swing.JOptionPane;

public class Name {

	//variables
	private String firstName = "";
	private String middleName = "";
	private String lastName= "";
	
	//constructor for inputs
	public Name(String firstName, String middleName, String lastName) {
		super();
		setFirstName(firstName);
		if (middleName.length() > 0) {
			setMiddleName(middleName);
		}
		setLastName(lastName);
	}
	
	public Name(String firstName, String lastName) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
	}

	//used to construct new Name
	public Name() {
			String message = "What is the first name: ";
			firstName = JOptionPane.showInputDialog(message); 
			setFirstName(firstName);
			
			message = "What is the middle name: ";
			middleName = JOptionPane.showInputDialog(message);
			if (middleName.length() > 0) {
				setMiddleName(middleName);
			}
			
			message = "What is the last name: ";
			lastName = JOptionPane.showInputDialog(message);
			setLastName(lastName);	
	}

	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		while (firstName.length() < 1) {
			String message = "What is the first name: ";
			String error = "That's not a valid first name!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			firstName = JOptionPane.showInputDialog(message); 		
		}
		
		firstName.toLowerCase();
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);     //these ensure sentence case for the names
		this.firstName = firstName;
	}

	public char getMiddleName() {
		return middleName.charAt(0);
	}

	public void setMiddleName(String middleName) {
		middleName.toLowerCase();
		middleName = middleName.substring(0,1).toUpperCase() + middleName.substring(1);  //these ensure sentence case for the names
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		while (lastName.length() < 1) {
			String message = "What is the last name: ";
			String error = "That's not a valid last name!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			lastName = JOptionPane.showInputDialog(message);		
		}
		
		lastName.toLowerCase();
		lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);        //these ensure sentence case for the names
		this.lastName = lastName;
	}
	
	//toString
	@Override
	public String toString() {
		if (middleName.length() < 1) {
			return getFirstName() + " " + getLastName();
		}
		else {
			return getFirstName() + " " + getMiddleName() + " " + getLastName();
		}
	}

}//end of Name