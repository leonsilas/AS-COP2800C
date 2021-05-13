package testingGrounds;

public class Dog {

	//variables
	private String name;
	private int weight;
	
	//constructor to build an object
	public Dog(String name, int weight) {
		setName(name);
		setWeight(weight);
	}

	//getters and setters to allow viewing and modifying
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	//toString for output
	@Override
	public String toString() {
		return "My name is " + name + " and I weigh " + weight;
	}
	
}
