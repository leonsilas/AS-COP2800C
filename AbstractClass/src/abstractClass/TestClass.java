/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 15/11/20
 * Purpose.....: Show use of Abstract Classes using Behemoths from the game Dauntless.  Check it out if
 * 				 you want to know more about this!  It's almost just like Animals :)
 * 				 The hardest part of this project was definitely getting creative haha.
 ********************************************************************************************************/

package abstractClass;

public class TestClass {

	public static void main(String[] args) {
		
		Pangar fighter1 = new Pangar( 100 , 25);
		Gnasher fighter2 = new Gnasher( 100 , 15);
		
		//introduction
		System.out.println("WELCOME TO THE DAUNTLESS THUNDERDOME");
		System.out.println("HERE ARE OUR FIGHTERS");
		fighter1.battleCry();
		System.out.println(" " + fighter1);
		fighter2.battleCry();
		System.out.println(" " + fighter2);
		System.out.println("LET THE FIGHT BEGIN!!");
		
		//fight
		while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
			fighter1.setHealth(fighter1.getHealth() - fighter2.getPower());
			fighter2.setHealth(fighter2.getHealth() - fighter1.getPower());
			System.out.println("...");
		}
		
		if (fighter1.getHealth() == 0)
			fighter1.deathCry();
		else fighter2.deathCry();
		
		//final output
		System.out.println();
		System.out.println("AND THE WINNER IS...");
		if (fighter1.getHealth() > 0)
			System.out.println(fighter1);
		else System.out.println(fighter2);	
		
	}//end of main

}//end of TestClass
