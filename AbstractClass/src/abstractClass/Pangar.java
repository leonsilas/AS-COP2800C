package abstractClass;

public class Pangar extends Behemoth {

	//constructor
	public Pangar(int health, int power) {
		super(health, power);
	}

	//methods
	public void battleCry() {
		System.out.print("GRAHHH");
	}

	public void deathCry() {
		System.out.print("Shaaaahh...");
	}
	
	//toString
	public String toString() {
		return "Pangar [Health = " + getHealth() + ", Power = " + getPower() + "]";
	}
	
}//end of Pangar
