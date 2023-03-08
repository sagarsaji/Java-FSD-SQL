package unique;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner u = new Scanner(System.in);
		String s;
		s = u.nextLine();
		String a = s.replaceAll("[!@#$%^&*()0-9,.?:;]","");
		String[] r = a.split(" ");
		List<String> g = Arrays.asList(r);
		int w = g.size();
		List<String> e = g.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
		int q = e.size();
		System.out.println("Number of words : "+w);
		System.out.println("Number of unique words : "+q);
		System.out.println("The unique words are : ");
		e.forEach(t->System.out.println(t));
	u.close();
	}

}
