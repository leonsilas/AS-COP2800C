package testingGrounds;

import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		//user input
		Scanner input = new Scanner(System.in);
		System.out.println("What number would you like to check?");
		int num = input.nextInt();
		System.out.println("What would you like to mod it by?");
		int mod = input.nextInt();
		
		//math
		int result = num % mod;
		
		//output
		if (result == 0)
			System.out.println("This has no remainder");
		else 
			System.out.println("This has a remainder of " + result);
		
	}//end main

}//end TestClass
