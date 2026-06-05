package p1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
//		Map<Integer, String> m1 = new HashMap<>();
		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(121, "Anil");
		m1.put(143, "Ramesh");
		m1.put(132, "Mukesh");
		m1.put(152, "Suresh");
		m1.put(163, "Ramesh");
		m1.put(163, "Ram");
		// duplicate keys are not allowed however it will
		// replace the value for the present key

		System.out.println("size of m1 - " + m1.size());

		System.out.println("Keys - ");
		Set<Integer> keys = m1.keySet();
		for (Integer k : keys)
			System.out.print(k + ", ");

		System.out.println();
		System.out.println("values - ");
		Collection<String> values = m1.values();
		for (String v : values)
			System.out.print(v + ", ");
		System.out.println();

		String value = m1.get(153);
		System.out.println("value - " + value);
	}

}
