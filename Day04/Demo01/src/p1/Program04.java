package p1;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the numerator - ");
			int n = sc.nextInt();
			System.out.print("Enter the denominator - ");
			int d = sc.nextInt();
			int res = n / d;
			System.out.println("Result - " + res);
		} catch (Exception e)// generic catch block
		{
			System.out.println("some thing went wrong");
			e.printStackTrace();
		}
		System.out.println("Program Finished");
	}

}
