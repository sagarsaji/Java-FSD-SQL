package collections;

import java.util.Scanner;

public class isbm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a 10 digit number : ");
		String s = n.next();
		long num = Long.parseLong(s);
		long temp = num;
		
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			long lastnum = num%10;
			sum += i*lastnum;
			num=num/10;y
		}
		
		if(sum%11==0) {
			System.out.println(temp+" is an ISBN number");
		}
		else {
			System.out.println(temp+" is not an ISBN number");
		}
		n.close();
	}

}
