package interfaces;
import java.util.Random;

public class KeystonePangar implements Behemoth, Frost, Boss {
	//variables
	private int currentHP = 0;
	private int currentDMG = 0;
	
	//constructor
	public KeystonePangar(int currentHP, int currentDMG) {
		super();
		setCurrentHP(currentHP);
		setCurrentDMG(currentDMG);
		this.currentDMG = currentDMG;
	}
	
	//getters and setters
	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		if (currentHP < maxHealth && currentHP > 0)
			this.currentHP = currentHP;
		else currentHP = maxHealth;
	}

	public int getCurrentDMG() {
		return currentDMG;
	}

	public void setCurrentDMG(int currentDMG) {
		if (currentDMG < maxDamage && currentDMG > 0)
			this.currentDMG = currentDMG;
		else currentDMG = maxDamage;
	}
	
	//interface methods
	@Override
	public boolean effectiveAgainstPlayer() {
		return true; //reason I put it like this is because keystone behemoths are always effective against players 
					 //but you could make it so there was an if statement to check against other things
	}

	@Override
	public void battleCry() {
		System.out.println("GRAHHH");
	}

	@Override
	public void deathCry() {
		System.out.println("Shaaaahh...");
	}

	@Override
	public int specialAttack() {
		//variables
		Random temp = new Random();
		int damage = 0;
		
		//randomizer to determine amount
		damage = temp.nextInt(maxDamage) + 1;
		return damage;
	}

	@Override
	public boolean isEnraged(int currentHP) {
		if (currentHP <= phaseHP)
			return true;
		else return false;
	}

	@Override
	public int biomeSpawn() {
		//variables
		Random temp = new Random();
		int biome = 0;
		
		//randomizer to determine amount
		biome = temp.nextInt(3) + 1; //num 5 could be replaced with the num of biomes, but that's beyond scope
		return biome;
	}

	//toString
	@Override
	public String toString() {
		return  "Keystone Pangar [ HEALTH : " + getCurrentHP() + " | STRENGTH : " + getCurrentDMG() + " | DANGEROUS? " + effectiveAgainstPlayer() 
				+ " | SPECIAL ATTACK DAMAGE : " + specialAttack() + " | ENRAGED? " + isEnraged(currentDMG) + " | SPAWNED IN BIOME " + biomeSpawn() + " ]";
	}

}//end of KeystonePangar