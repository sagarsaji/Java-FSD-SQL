package practisee;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Largestlinkedlis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int[] a = new int[7];
		LinkedList<Integer> lst = new LinkedList<Integer>();
		for(int i=0;i<7;i++) {
			a[i] = n.nextInt();
			lst.add(a[i]);
		}
		int k=4;
		List<Integer> lss = lst.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(lss.get(k-1));
	}

}
