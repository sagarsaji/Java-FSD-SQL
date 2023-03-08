package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class itrtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss;
		int s;
		ArrayList<String> list = new ArrayList<String>();
		Scanner n = new Scanner(System.in);
		System.out.println("Enter size : ");
		s = n.nextInt();
		System.out.println("Enter names : ");
		for(int i=0;i<s;i++) {
			ss = n.next();
			list.add(ss);
		}
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
