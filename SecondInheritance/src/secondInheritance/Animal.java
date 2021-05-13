package secondInheritance;

import javax.swing.JOptionPane;

public class Animal {

	//attributes
	private String name;
	private char sex;
	private int weight;
	private int height;
	
	//constructors
	public Animal(String name, char sex, int weight, int height) {
		setName(name);
		setSex(sex);
		setWeight(weight);
		setHeight(height);
	}//overloaded method
	
	public Animal() {
		String message = "What is this animal's name: ";
		name = JOptionPane.showInputDialog(message); 
		setName(name);
		setSex(sex);
		setWeight(weight);
		setHeight(height);
	}//overloaded method

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		while (name.length() < 1) {
			String message = "What is this animal's name: ";
			String error = "That's not a valid name!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			name = JOptionPane.showInputDialog(message); 		
		}
		name.toLowerCase();
		name = name.substring(0,1).toUpperCase() + name.substring(1);     //these ensure sentence case for the names
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		String message = "What is the sex: ";
		String sexString = JOptionPane.showInputDialog(message);
		sexString.toUpperCase();
		sex = sexString.charAt(0);
		this.sex = sex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		int i = 0; //used to indicate if the catch is hit so it loops until a valid answer is entered
		do {
			i = 0;
			String message = "What is the animal's weight? [lbs]";
			String error = "That's not a valid weight!";
			try {
				weight = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
				i = 1;
			}
			if (weight < 0) {
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			}
		} while (weight < 0 || i == 1);
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		int i = 0; //used to indicate if the catch is hit so it loops until a valid answer is entered
		do {
			i = 0;
			String message = "What is the animal's height? [ft]";
			String error = "That's not a valid height!";
			try {
				height = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
				i = 1;
			}
			if (height < 0) {
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			}
		} while (height < 0 || i == 1);
		this.height = height;
	}

	@Override
	public String toString() {
		return name + " is " + sex + " with a weight of " + weight + "lbs and a height of " + height + "ft.";
	}//overriden method
	
}//end Animal
