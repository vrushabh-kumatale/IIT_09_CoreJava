package com.sunbeam;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
	
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println("file found");
			
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
			
		}

	}

}
