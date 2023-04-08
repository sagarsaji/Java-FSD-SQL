package prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Countt {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		int yr = n.nextInt();
		int k = n.nextInt();
		int[] d = new int[k];
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < d.length; i++) {
			d[i] = n.nextInt();
			arr.add(d[i]);
		}
		int count = 0;
		ArrayList<Integer> num = new ArrayList<>();
		int i = yr;
		while (i <= 20000) {
			int numm = i;
			int temp = numm;
			while (numm != 0) {
				int rem = numm % 10;
				num.add(rem);
				numm = numm / 10;
			}
			for (int ch : num) {
				if (arr.contains(ch)) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(temp);
				break;
			}
			count = 0;
			num.clear();
			i++;
		}
	}

}
