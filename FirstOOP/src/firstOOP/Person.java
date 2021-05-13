package firstOOP;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Person {
	
	//variables
	private Name name;
	private char gender;
	private int age;
	private int salary;
	Scanner userInput = new Scanner(System.in);
	
	//constructor
	public Person(Name name, char gender, int age, int salary) {
		setName(name);
		setGender(gender);
		setAge(age);
		setSalary(salary);
	}

	public Person() {
		generateSpawn();
	}

	//creates a "random" person
	public void generateSpawn() {
		System.out.println("Would you like to set the information for this new person or randomize it?");
		System.out.println("1. Set person.");
		System.out.println("2. Random person.");
		Scanner userInput = new Scanner(System.in);
		int temp = userInput.nextInt();
		
		if (temp == 1) {
			setName(new Name(true));
			String message = "What is your gender? [M] or [F]";
			gender = JOptionPane.showInputDialog(message).toUpperCase().charAt(0);
			setGender(gender);
			message = "What is your age?";
			age = Integer.parseInt(JOptionPane.showInputDialog(message));
			setAge(age);
			message = "What is your salary? [No $ or , needed]";
			salary = Integer.parseInt(JOptionPane.showInputDialog(message));
			setSalary(salary);
		}
		
		else if (temp == 2) {
			randomizeSpawn();	
		}
		
		else {
			System.out.println("Invalid input. Randomizing anyway.");
			randomizeSpawn();
		}
		
	}//end generateSpawn

	//changes Person's info
	public void changeSpawn(int selection) {
		//used to edit the name, gender, age, and salary
		
		System.out.println("");
		
		//menu to choose what to change
		int menuChoice;
		Scanner userInput = new Scanner(System.in);
			do {
				
				//menu printout
				System.out.println("Please choose what you would like to edit for person " + selection + ": ");
				System.out.println("1. Name");
				System.out.println("2. Age");
				System.out.println("3. Gender");
				System.out.println("4. Salary");
				System.out.println("5. Exit");
				menuChoice = userInput.nextInt();
				System.out.println("");
				
				//switch
				switch (menuChoice) {
				
				case 1: //sets name
					setName(new Name (true));
					break;
					
				case 2: //sets age
					System.out.println("Please enter an age.");
					setAge(userInput.nextInt());
					break;
					
				case 3: //sets gender
					System.out.println("Please enter a gender. [M] or [F]");
					setGender(userInput.next().toUpperCase().charAt(0));
					break;
					
				case 4:	//sets salary
					System.out.println("Please enter a salary.");
					setSalary(userInput.nextInt());
					break;
					
				case 5: //exit
					break;
					
				default:
					System.out.println("");	
					System.out.println("Sorry that is an invalid choice.");
					System.out.println("");			
				
				}//end of switch
			
			} while (menuChoice != 5); //end of loop
			
	}//end of changeSpawn

	
	public void randomizeSpawn() {
		setName(new Name(false));
		Random rand = new Random();
		int temp = rand.nextInt(2);
		if ( temp == 1) {
			gender = 'M';
		}
		else {
			gender = 'F';
		}
		age = rand.nextInt(120) + 1;
		salary = rand.nextInt(99000) + 10001; //makes minimum 10,000 and max 100,000 for this program
	}
	
	//getters and setters
	public Name getName() {
		return name;
	}
	

	public void setName(Name name) {
		this.name = name;
	}
	

	public char getGender() {
		return gender;
	}
	

	public void setGender(char gender) {
		if (gender != 'M' || gender != 'F') {
			gender = 'X';
		}
		
		else {
			this.gender = gender;
		}
	}
	

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		if (age < 0 || age > 120) {
			age = 0;
		}
		else {
			this.age = age;
		}
	}
	

	public int getSalary() {
		return salary;
	}
	

	public void setSalary(int salary) {
		if (salary < 0) {
			salary = 0;
		}
		else {
			this.salary = salary;
		}
	}

	//toString
	@Override
	public String toString() {
		return name + ", " + age + gender + ", "  + "Salary: $" + salary;
	}

	
}//end of Person
