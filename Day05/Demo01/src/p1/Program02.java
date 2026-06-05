package p1;

import java.util.ArrayList;

public class Program02 {

	public static void main(String[] args) {

		// List<String> names = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		names.add("Anil");
		names.add("Mukesh");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Ram");
		names.add("Sham");

		System.out.println("Before Remove - " + names.size());
		names.remove(2); // remove method works on index
		names.remove("Suresh");
		System.out.println("After Remove - " + names.size());

		System.out.println("Is list have the item - " + names.contains("Ramesh")); // returns true or false
		System.out.println("index of the given item : " + names.indexOf("Ramesh")); // returns the index or -1

		System.out.println("Using For-each");
		for (String element : names)
			System.out.println("Element - " + element);

	}

}
