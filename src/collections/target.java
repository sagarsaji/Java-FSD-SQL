package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int flag=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter some numbers : ");
		for(int i=0;i<5;i++) {
			num = s.nextInt();
			list.add(num);
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(list.get(i)+list.get(j)==25) {
					flag = 1;
				}
			}
		}
		if(flag==1) {
			System.out.println("target found");
		}
		else {
			System.out.println("invalid");
		}
	}

}
