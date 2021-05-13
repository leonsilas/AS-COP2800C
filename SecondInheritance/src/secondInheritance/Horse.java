package secondInheritance;
import javax.swing.JOptionPane;

public class Horse extends Animal {

	//attributes
	private String breed;
	private String rider;
	private String trainer;
	private int stable;
	
	//constructors
	public Horse(String name, char sex, int weight, int height, String breed, String rider, String trainer, int stable) {
		super(name, sex, weight, height);
		setBreed(breed);
		setRider(rider);
		setTrainer(trainer);
		setStable(stable);
	}//overloaded method
	
	public Horse() {
		String message = "What is this horse's breed: ";
		breed = JOptionPane.showInputDialog(message); 
		setBreed(breed);
		message = "What is this horse's riders's name: ";
		rider = JOptionPane.showInputDialog(message);
		setRider(rider);
		message = "What is this horse's trainer's name: ";
		trainer = JOptionPane.showInputDialog(message); 
		setTrainer(trainer);
		setStable(stable);
	}//overloaded method

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		while (breed.length() < 1) {
			String message = "What is this horse's breed: ";
			String error = "That's not a valid breed name!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			breed = JOptionPane.showInputDialog(message); 
		}
		breed.toLowerCase();
		breed = breed.substring(0,1).toUpperCase() + breed.substring(1);
		this.breed = breed;
	}

	public String getRider() {
		return rider;
	}

	public void setRider(String rider) {
		while (rider.length() < 1) {
			String message = "What is this horse's riders's name: ";
			String error = "That's not a valid rider name!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			rider = JOptionPane.showInputDialog(message); 		
		}
		
		rider.toLowerCase();
		rider = rider.substring(0,1).toUpperCase() + rider.substring(1);     //these ensure sentence case for the names
		this.rider = rider;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		while (trainer.length() < 1) {
			String message = "What is this horse's trainer's name: ";
			String error = "That's not a valid trainer name!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			trainer = JOptionPane.showInputDialog(message); 		
		}
		
		trainer.toLowerCase();
		trainer = trainer.substring(0,1).toUpperCase() + trainer.substring(1);     //these ensure sentence case for the names
		this.trainer = trainer;
	}

	public int getStable() {
		return stable;
	}

	public void setStable(int stable) {
		int i = 0; //used to indicate if the catch is hit so it loops until a valid answer is entered
		do {
			i = 0;
			String message = "What stable is this horse in?";
			String error = "That's not a valid stable!";
			try {
				stable = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
				i = 1;
			}
			if (stable < 0) {
				JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			}
		} while (stable < 0 || i == 1);
		this.stable = stable;
	}

	@Override
	public String toString() {
		return getName() + " is a " + getSex() + " " + breed + " that rests in stable " + stable + " They are trained by " + trainer + " and ridden by " + rider + "." 
				+ " They weight " + getWeight() + "lbs and stand at a height of " + getHeight() + "ft.";
	}//overriden method
	
}//end Horse
