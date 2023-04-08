package prac;

import java.util.ArrayList;
import java.util.List;

public class upperr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("sun");
		a.add("moon");
		a.add("earth");
		
		List<String> lst = a.stream().map(t->t.toUpperCase()).toList();
		System.out.println(lst);
	}

}
