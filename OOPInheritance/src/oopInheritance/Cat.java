package oopInheritance;

public class Cat extends Animal{
	//variables
	private String name;
	private int lives;
	
	//constructor
	public Cat(int weight, int height, String name, int lives) {
		super(weight, height);
		setName(name);
		setLives(lives);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	//method to kill a cat and track their lives
	public void catDies() {
		setLives(getLives() - 1);
	}
	
	//toString
	@Override
	public String toString() {
		return "This cat's name is: " + name + " and they have " + lives + " lives. " + super.toString();
	}

	
}//end Cat
