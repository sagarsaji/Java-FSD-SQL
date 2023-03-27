package prac;

import java.util.Scanner;

public class Maxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		int max = 0;
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = n.nextInt();
		}
		for(int i=0;i<num;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Max number : " + max);
	}

}
