package predicate;

import java.util.Arrays;
import java.util.List;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> city = Arrays.asList("Hyderabad","Tvm","Trisur","Kochi");
		List<String> c = city.stream().filter(t->t.toLowerCase().startsWith("k")).toList();
		System.out.println(c);
	}

}
