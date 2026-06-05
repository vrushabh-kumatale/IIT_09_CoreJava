package p1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
//		Set<String> s1 = new HashSet<>(); // does not gurantee the order of elements
		Set<String> s1 = new LinkedHashSet<>(); // maintains the insertion order

		s1.add("Anil");
		s1.add("Mukesh");
		s1.add("Ramesh");
		s1.add("Suresh");
		s1.add("Ramesh"); // duplicates are not allowed
		s1.add("Mukesh"); // duplicates are not allowed

		System.out.println("No of elements - " + s1.size());
		for (String e : s1)
			System.out.println(e);

	}

}
