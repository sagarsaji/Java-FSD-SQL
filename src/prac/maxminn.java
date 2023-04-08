package prac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class maxminn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "grass is greener on the other side";
		String s = s1.replace(" ", "");
		int[] arr = new int[s.length()];
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int c = map.get(s.charAt(i));
				c++;
				map.replace(s.charAt(i), c);
			} else {
				count++;
				map.put(s.charAt(i), count);

			}
			count = 0;
		}

		Character maxval = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		Character minval = map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();

		System.out.println("Max occuring value : " + maxval);
		System.out.println("Min occuring value : " + minval);

	}

}
