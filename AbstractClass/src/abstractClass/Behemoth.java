package abstractClass;

abstract public class Behemoth {

	//variables
	private int health;
	private int power;
	
	//constructors
	public Behemoth(int health, int power) {
		setHealth(health);
		setPower(power);
	}

	//getters and setters
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {	
		if (health < 0)
			this.health = 0;
		else
			this.health = health;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if (power < 0)
			this.power = 0;
		else
			this.power = power;
	}

	//abstract methods
	abstract public void battleCry();
	
	abstract public void deathCry();

	//toString
	public String toString() {
		return "Behemoth [Health = " + getHealth() + ", Power = " + getPower() + "]";
	}
	
}//end of Behemoth
