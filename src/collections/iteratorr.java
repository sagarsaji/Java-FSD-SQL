package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("apple");
		lst.add("mango");
		lst.add("grapes");
		Iterator itr = lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
