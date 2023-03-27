package prac;

import java.util.Scanner;

public class Summm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int size;
		size = n.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = n.nextInt();
		}
		int sum = 0;
		int[] ans = new int[size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(j!=i) {
					sum += arr[j];
				}
			}
			ans[i] = sum;
			sum = 0;
		}
		for(int i=0;i<size;i++) {
			System.out.println(ans[i]);
		}
		
	}

}
