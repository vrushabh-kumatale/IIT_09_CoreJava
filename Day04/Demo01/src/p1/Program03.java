package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the numerator - ");
			int n = sc.nextInt();
			System.out.print("Enter the denominator - ");
			int d = sc.nextInt();
			int res = n / d;
			System.out.println("Result - " + res);
		} catch (ArithmeticException ex) {
			System.out.println("Divide by 0 is not possible");
		} catch (InputMismatchException ex) {
			System.out.println("Wrong input");
		}
		System.out.println("Program Finished");
	}

}
