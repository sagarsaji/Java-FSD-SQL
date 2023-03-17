package practisee;

import java.util.Scanner;

public class Onedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		int[] a = new int[num];
		for(int i=0;i<num;i++) {
			a[i] = n.nextInt();
		}
		for(int i=0;i<num;i++) {
			System.out.println(a[i]);
		}
	}

}
