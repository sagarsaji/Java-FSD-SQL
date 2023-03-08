package practice;

import java.util.Scanner;

public class gcd {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		int gcd = 1;
		int n1 = n.nextInt();
		int n2 = n.nextInt();
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		int lcm = (n1*n2)/gcd;
		System.out.println(lcm);
	}
	
	
}
