/********************************************************************************************************
 * Written By..: Leon Silas
 * Date Written: 16/10/20
 * Purpose.....: Show application of Dr. Archibald's video with inheritance and is/has a relationships.
 * //NOTE: THIS PROGRAM DOES NOT ALLOW USER TO INPUT.  I didn't see it in the scope so I didn't add it.
 ********************************************************************************************************/
package oopInheritance;

public class NoahsArk {

	public static void main(String[] args) {

	//creates one of each animal
	Dog myDog = new Dog(50, 24, "Jet", "Pitbull", "011117");
	Cat myCat = new Cat(10, 12, "Vanitas" , 7);					
	Bird myBird = new Bird(3, 5, 6.4, true);

	//calls their toStrings
	System.out.println(myDog);
	System.out.println(myCat);
	System.out.println(myBird);
	
	}//end main

}//end NoahsArk
