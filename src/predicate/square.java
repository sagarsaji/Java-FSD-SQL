package predicate;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(2,3,4,5,6);
		//List<Integer> even = s.stream().filter(t->t%2==0).forEach(t->);		
		List<Integer> a = s.stream().filter(t->t%2==0).map(t->t*t).toList();
		System.out.println(a);
		}
		
}
