package p1;

public class Program05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000); // checked exception
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("count - " + i);
		}
		System.out.println("Program Finished");
	}

}
