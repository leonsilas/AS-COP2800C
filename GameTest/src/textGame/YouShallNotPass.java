/**********************************************************************************************
 * Written By..: Leon Silas 
 * Date Written: 05/10/20 - ONGOING
 * Purpose.....: Test out possible text based game development.
 **********************************************************************************************/

package textGame;
import java.util.Scanner;

public class YouShallNotPass {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("\\\\********* [Welcome to [PENDING GAME NAME]!!] *********//");
		System.out.println("\\\\*********      Developed By: Leon Silas      *********//");
		System.out.println("\\\\********* Please enter your characters name. *********//");
		String userName = userInput.next();
		System.out.println("Is your name... " + userName + "?");
		
		
	}

}
