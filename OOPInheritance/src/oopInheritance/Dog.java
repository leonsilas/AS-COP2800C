package oopInheritance;

public class Dog extends Animal {
	//variables
	private String name;
	private String breed;
	private String birthday;

	//constructor
	public Dog(int weight, int height, String name, String breed, String birthday) {
		super(weight, height);
		setName(name);
		setBreed(breed);
		setBirthday(birthday);
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBirthday() {
		if (birthday.length() == 6) {
		birthday = birthday.charAt(0) + birthday.charAt(1) + " / " + birthday.charAt(2) + birthday.charAt(3) + " / " 
		+ birthday.charAt(4) + birthday.charAt(5);  //I am legitimately confused why this doesn't print out the first 2 values.
		}
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	//toString
	@Override
	public String toString() {
		return "This dog's name is: " + name + ". They are a " + breed + ", and were born on " + getBirthday() + ". " + super.toString();
	}
	
}//end Dog
