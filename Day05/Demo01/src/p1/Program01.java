package p1;

import java.util.ArrayList;

public class Program01 {

	public static void main(String[] args) {

		// List<String> names = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Mukesh");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ram");
		names.add("Sham");

		// Is only allowed for the List and its sub types
		for (int i = 0; i < names.size(); i++)
			System.out.println("Element - " + names.get(i));

		System.out.println("Using For-each");
		for (String element : names)
			System.out.println("Elemenet - " + element);

	}

}
