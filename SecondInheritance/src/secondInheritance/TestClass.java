package secondInheritance;

public class TestClass {

	public static void main(String[] args) {

		//generates 3 of each class (animal and horse)
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Horse horse1 = new Horse();
		Horse horse2 = new Horse();
		Horse horse3 = new Horse();
		
		//outputs each one
		System.out.println(animal1);
		System.out.println(animal2);
		System.out.println(animal3);
		System.out.println(horse1);
		System.out.println(horse2);
		System.out.println(horse3);
		
	}//end main

}//end TestClass
