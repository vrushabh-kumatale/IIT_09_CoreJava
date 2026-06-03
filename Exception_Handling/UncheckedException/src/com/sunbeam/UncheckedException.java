package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Numerator:");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Denomenator:");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			
			System.out.println("Result :"+result);
			
		}catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
			
		}catch(InputMismatchException e) {
			System.out.println("Wrong input");
			
		}

		System.out.println("Program Executed!!");
		
	}

}
