package practisee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Smalledlinkedlis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int[] a = new int[5];
		LinkedList<Integer> lst = new LinkedList<Integer>();
		for(int i=0;i<5;i++) {
			a[i] = n.nextInt();
			lst.add(a[i]);
		}
		int k = 2;
		List<Integer> lss = lst.stream().sorted().toList();
		System.out.println(lss.get(k-1));
	}

}
