package prac;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		String s1 = n.next();
		String s2 = n.next();
		int flag = 0;
		s1.toLowerCase();
		s2.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				flag = 0;
			}
			else {
				flag = 1;
			}
		}
		if(flag==0) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
