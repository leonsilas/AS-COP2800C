package interfaces;

public interface Frost {
	//constants
	String behemothType = "Frost";
	
	//methods
	boolean effectiveAgainstPlayer(); //determines if the player gets extra damage against them
	int biomeSpawn(); //used to randomly pick map for players against this behemoth type
}
