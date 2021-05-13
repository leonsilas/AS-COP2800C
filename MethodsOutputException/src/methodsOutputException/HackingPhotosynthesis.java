/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 27/09/20
 * Purpose.....: Show use of methods, exceptions, text files with a menu based system.
 ********************************************************************************************************/

package methodsOutputException;
import java.io.*;
import java.util.Scanner;


public class HackingPhotosynthesis {

	public static void main(String[] args) {
		
		//initialize variables and scanner
		int menuChoice = 0;
		int userAge = 0;
		int userNum = 0;
		String userName = "";
		Scanner userInput = new Scanner(System.in);

		//loop for menu to exit
		do {
			
			//menu printout
			System.out.println("Please enter the number for the selection you wish to receive: ");
			System.out.println("1. Enter a first name and echo it back 20 times.");
			System.out.println("2. Enter an age and display it and it's double.");
			System.out.println("3. Use the age from #2 to output a statement.");
			System.out.println("4. Select an integer and get a text file with a triange of X's.");
			System.out.println("5. Exit");
			menuChoice = userInput.nextInt();
			blankSpace();		//used frequently in the code for viewing pleasure, no actual value.
			
			//switch
			switch (menuChoice) {
			
			case 1:
				System.out.println("Please enter a first name.");
				userName = userInput.next();
				blankSpace();	
				recallName(userName);
				blankSpace();	
				break;
				
			case 2:
				System.out.println("Please enter an age.");
				userAge = userInput.nextInt();
				while (userAge <= 0) {
						blankSpace();	
						System.out.println("Sorry, that is an invalid age. Please try again.");
						blankSpace();	
						userAge = userInput.nextInt();
				}
				
				blankSpace();	
				doubleAge(userAge);
				blankSpace();		
				break;
				
			case 3:
				if (userAge <= 0){
					System.out.println("Sorry, you didn't enter an age in #2.");
					blankSpace();	
					break;
				}
				
				else if (userAge > 0) {
					ageStatement(userAge);
					blankSpace();		
				}
						
				break;
				
			case 4:	
				System.out.println("Please enter an integer between 3 and 50.");
				userNum = userInput.nextInt();
				while (userNum < 3 || userNum > 50) {
					blankSpace();	
					System.out.println("Sorry, that is an invalid number. Please try again.");
					blankSpace();	
					userNum = userInput.nextInt();
				}
				
				blankSpace();
				triangleText(userNum);
				blankSpace();
				break;
				
			case 5:
				break;
				
			default:
				blankSpace();	
				System.out.println("Sorry that is an invalid choice.");
				blankSpace();		
			
			}//end of switch
		
		} while (menuChoice != 5); //end of loop
		
		//style for program termination
		System.out.println("Thanks for using my system!");

	}//end of main
	
	
	/*Various Methods*/
	
	static void blankSpace() {
		System.out.println("");	
	}//end of blankSpace
	
	static void recallName(String userName) {
		String userNameReverse = "";
		
		
		for  (int i = userName.length() - 1; i >= 0; i--) {
			userNameReverse += userName.charAt(i);
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println((i + 1)  + ". " + userName + " " + userNameReverse);
		}
	}//end of recallName
	
	static void doubleAge(int userAge) {
		int userAgeDouble = userAge * 2;
		System.out.println("The age you entered is: " + userAge);
		System.out.println("Double that age is: " + userAgeDouble);
	}//end of doubleAge
	
	static void ageStatement(int userAge) {
		if (userAge >= 13 && userAge <= 19) {
			System.out.println("Since you are " + userAge + " years old, you are a teenager.");
		}
		
		else {
			System.out.println("Since you are " + userAge + " years old, you are NOT a teenager.");
		}
	}//end of ageStatement
	
	static void triangleText(int userNum) {
		try {
		File triangleFile = new File("Triangle.txt");
		PrintWriter out = new PrintWriter(triangleFile);
		
		//loop to make triangle
        for (int j = 1; j <= userNum; j++) { 
        	  
            for (int k = userNum; k >= j; k--) { 
                out.print(" "); 
            } 
  
            for (int k = 1; k <= j; k++) { 
                out.print("X "); 
            } 
            out.println();
        }//end of loop
        
		out.close();
		System.out.println("Please check your folder for the file I've just created called Triangle.txt.");
		}//end try
		
		catch (FileNotFoundException fnf) {
			System.out.println("Can't open the file. Aborting file creation.");
		}//end catch
		
	}//end of triangleText

}//end of HackingPhotosynthesis
