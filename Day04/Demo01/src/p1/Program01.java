package p1;

public class Program01 {

	public static void main(String[] args) {

		int n = 10;
		int d = 0;
		try {
			int res = n / d;
			System.out.println("Result - " + res);
		} catch (ArithmeticException ex) {
			System.out.println("Divide by 0 is not possible");
		} finally {
			System.out.println("Finally called");
		}
		System.out.println("Program Finished");
	}

}
