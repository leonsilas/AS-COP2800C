/**********************************************************************************************
 * Written By..: Leon Silas (Brieana McFarland)
 * Date Written: 27/08/20
 * Purpose.....: Demonstrate input and output as well as decision statements with given inputs.
 **********************************************************************************************/

package simpleIO;
import java.util.Scanner;

public class SlapInSpitOut {

	public static void main(String[] args) {
		
		//declare variable
		String numType = "";
		
		//user inputs
		System.out.println("Please input your fullname, age, and favorite number. (Please press enter on each individual input.)");
		Scanner inObj = new Scanner(System.in);
		String fullName = inObj.nextLine();
		int age = inObj.nextInt();
		int favNum = inObj.nextInt();
		
		//if statements for odd v. even
		
		if (favNum % 2 == 0) {
			numType = " an even number.";
		}
		
		else {
			numType = " an odd number.";
		}
		
		//if statements for age and output
		
		if (age <= 20) {
			System.out.print("Hello, " + fullName + ". You are " + age + " years old. You are still young.  "
					+ "I see your favorite number " + favNum + " is" + numType );
		}
			
		else if (age > 20 && age <= 80) {
			System.out.print("Hello, " + fullName + ". You are " + age + " years old. You are not too old and not too young. "
					+ "I see your favorite number " + favNum + " is" + numType );
		}
		
		else if (age > 80) {
			System.out.print("Hello, " + fullName + ". You are " + age + " years old. You are extremely old. "
					+ "I see your favorite number " + favNum + " is" + numType );
		}
		
	} //end of main method

} //end of SlapInSpitOut class
