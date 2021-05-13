/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 18/11/20
 * Purpose.....: Show use of Interfaces in a TestClass by applying them to an object. Extending the theme
 * 				 of Behemoths from the AbstractClass assignment!
 ********************************************************************************************************/

package interfaces;

public class TestClass {

	public static void main(String[] args) {
		//variables + object creation
		String flavorText = "Be careful skipper! There's a fearsome beast ahead of you.  Here's what Arkan was able to find in the scan for you.";
		KeystonePangar alpha = new KeystonePangar(400,50);
		
		//output
		alpha.battleCry();
		System.out.println(flavorText);
		System.out.println(alpha);
		
	}//end of main

}//end of TestClass