package interfaces;

public interface Boss {
	//constants
	int phaseHP = 500; //HP marker to go into phase 2
	
	//methods
	int specialAttack(); //this would theoretically return the damage of the attack
	boolean isEnraged(int currentHP); //this would cause extra damage to the player if true
	
}
