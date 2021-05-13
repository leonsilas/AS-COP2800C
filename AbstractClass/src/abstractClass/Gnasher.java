package abstractClass;

public class Gnasher extends Behemoth {

	//constructor
	public Gnasher(int health, int power) {
		super(health, power);
	}

	//method
	public void battleCry() {
		System.out.print("SCREEE");
	}

	public void deathCry() {
		System.out.print("Craaah..");
	}
	
	//toString
	public String toString() {
		return "Gnasher [Health = " + getHealth() + ", Power = " + getPower() + "]";
	}
	
}//end of Gnasher
