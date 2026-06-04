package p2;

// checked exception
class InvalidTimeException extends Exception {
	public InvalidTimeException() {
	}

	public InvalidTimeException(String message) {
		super(message);
	}
}

class Time {
	private int hr;
	private int min;

	public void setHr(int hr) throws InvalidTimeException {
		if (hr < 0 || hr > 23)
			throw new InvalidTimeException(); // generate a new exception
		this.hr = hr;
	}

	public void setMin(int min) throws InvalidTimeException {
		if (min < 0 || min > 59)
//			throw new InvalidTimeException();
			throw new InvalidTimeException("min should be between 0 and 59");
		this.min = min;
	}

	public void displayTime() {
		System.out.println("Time - " + hr + ":" + min);
	}
}

public class Program01 {

	public static void main(String[] args) {
		Time t1 = new Time();
		try {
			t1.setHr(20);
			t1.setMin(80);
			t1.displayTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program finished");

	}

}
