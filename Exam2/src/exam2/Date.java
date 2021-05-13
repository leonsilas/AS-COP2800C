package exam2;
import javax.swing.JOptionPane;

public class Date {
	
	//variables
	private int month = 0;
	private int day = 0;
	private int year = 0;
	private int i = 0;
	
	//constructor
	public Date(int month, int day, int year) {
		super();
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public Date() {
		
		String message = "What is the year: ";
		try {
			i = 0;
			year = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setYear(year, i);
		
		message = "What is the month [number]: ";
		try {
			i = 0;
			month = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setMonth(month, i);
		
		message = "What is the day: ";
		try {
			i = 0;
			day = Integer.parseInt(JOptionPane.showInputDialog(message));
		} catch (NumberFormatException e) {
			i = 1;
		}
		setDay(day, i);
		
		
	}

	//getters and setters
	public int getMonth() {
		return month;
	}

	
	public void setMonth(int month) {
		while (month > 12 || month < 1 || i == 1) {
			String message = "What is the month [number]: ";
			String error = "That's not a valid month!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				month = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			} 		
		}
		
		this.month = month;
	}
	
	public void setMonth(int month, int i) {
		while (month > 12 || month < 1 || i == 1) {
			String message = "What is the month [number]: ";
			String error = "That's not a valid month!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				month = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			} 		
		}
		
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		//determines if year is leap or not
		boolean leap = false;
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

		//if to set monthMax
		int monthMax = 0;
		if (month == 2 || month == 02) {
			if (leap)
				monthMax = 29;
			else
				monthMax = 28;
		}
		
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			monthMax = 30;
		}
		
		else {
			monthMax = 31;
		}
		
		//while to keep asking for day
		while (day > monthMax || day < 1 || i == 1) {
			String message = "What is the day: ";
			String error = "That's not a valid day!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				day = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}	 		
		}
		
		this.day = day;
	}
	
	public void setDay(int day, int i) {
		//determines if year is leap or not
		boolean leap = false;
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

		//if to set monthMax
		int monthMax = 0;
		if (month == 2 || month == 02) {
			if (leap)
				monthMax = 29;
			else
				monthMax = 28;
		}
		
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			monthMax = 30;
		}
		
		else {
			monthMax = 31;
		}
		
		//while to keep asking for day
		while (day > monthMax || day < 1 || i == 1) {
			String message = "What is the day: ";
			String error = "That's not a valid day!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				day = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}	 		
		}
		
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		//while to keep asking for 
		while (year < 0 || i == 1) {
			String message = "What is the year: ";
			String error = "That's not a valid year!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				year = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}	 		
		}
		this.year = year;
	}
	
	public void setYear(int year, int i) {
		//while to keep asking for 
		while (year < 0 || i == 1) {
			String message = "What is the year: ";
			String error = "That's not a valid year!";
			JOptionPane.showMessageDialog(null, error, "Wait a second..", JOptionPane.ERROR_MESSAGE);
			try {
				i = 0;
				year = Integer.parseInt(JOptionPane.showInputDialog(message));
			} catch (NumberFormatException e) {
				i = 1;
			}	 		
		}
		this.year = year;
	}

	//toString
	@Override
	public String toString() {
		return getMonth() + "/" + getDay() + "/" + getYear();
	}

}//end of Date

