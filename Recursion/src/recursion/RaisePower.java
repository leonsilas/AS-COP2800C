/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 25/09/20
 * Purpose.....: Show use of a method by passing through and raising one variable to the power of another.
 ********************************************************************************************************/

package recursion;
import java.lang.Math;
import java.util.Scanner;

	public class RaisePower {
	
		static void activateRaise(int x, int y) {
			
			double result = 0;
			result = Math.pow(x,y);
			System.out.println(x + " to the power of " + y + " is equal to " + result);
			
		}//end of activateRaise
	
	public static void main(String[] args) {
		
		//Variable Declaration
		int x = 0, y = 0;
		Scanner userInput = new Scanner(System.in);
		
		//Inputs
		System.out.println("Enter the first integer: ");
		x = userInput.nextInt();
		System.out.println("Enter the second integer: ");
		y = userInput.nextInt();
		
		//Outputs
		activateRaise(x,y);

	}//end of main

}//end of RaisePower
