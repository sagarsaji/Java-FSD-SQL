package predicate;

import java.util.Arrays;
import java.util.List;

public class Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(24,67,88,45,90);
		s.stream().filter(t->t%2==0).forEach(t->System.out.println("Even numbers : "+t));	}
		List<Integer> evenumber = s.stream().
}
