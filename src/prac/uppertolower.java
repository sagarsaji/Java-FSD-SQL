package prac;

import java.util.Scanner;

public class uppertolower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		String s = n.next();
		String s2 = "";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				s2 += Character.toLowerCase(s.charAt(i));
			}
			else if(Character.isLowerCase(s.charAt(i))) {
				s2 += Character.toUpperCase(s.charAt(i));
			}
			else {
				s2 += s.charAt(i);
			}
		}
		System.out.println(s2);
		
		
	}

}
