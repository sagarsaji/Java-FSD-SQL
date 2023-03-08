package frequency;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
	
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Sasi","Abu","Kodiyan","Sasi");
		Map<String,Long> dupe = s.stream().map(city->city.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));  
		System.out.println(dupe);
	}
}
