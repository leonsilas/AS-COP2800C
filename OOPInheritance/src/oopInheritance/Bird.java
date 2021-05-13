package oopInheritance;

public class Bird extends Animal {
	//variables
	private double wingSpan;
	private boolean fly;
	
	//constructor
	public Bird(int weight, int height, double wingspan, boolean fly) {
		super(weight, height);
		setWingspan(wingspan);
		setFly(fly);
	}
	
	//getters and setters
	public double getWingspan() {
		return wingSpan;
	}

	public void setWingspan(double wingspan) {
		this.wingSpan = wingspan;
	}

	public boolean canFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	//toString
	@Override
	public String toString() {
		return "This bird has a wingspan of " + wingSpan + ". Can they fly? " + fly + ". " + super.toString();
	}
		
	
}//end Bird
