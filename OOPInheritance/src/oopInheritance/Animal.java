package oopInheritance;

public class Animal {
	//variables
	private int weight;
	private int height;
	
	//constructor
	public Animal(int weight, int height) {
		setWeight(weight);
		setHeight(height);
	}
	
	//getters and setters
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		//verify weight is positive
		if (weight > 0) {
			this.weight = weight;
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		//verify height is positive
		if (height > 0) {
			this.height = height;
		}
	}
	
	//toString
	public String toString() {
		return "They are an animal weighing " + weight + " and have a height of " + height + ".";
	}

	
}//end Animal
