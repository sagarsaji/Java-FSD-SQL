package prac;

import java.util.Scanner;

public class anagramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		String s1 = n.next();
		String s2 = n.next();
		//int count = 0;
		int len1 = s1.length();
		int len2 = s2.length();
		int flag = 0;
		int[] arr = new int[26];
		if(len1!=len2) {
			System.out.println("not anagram");
		}
		else {
			for(int i=0;i<len1;i++) {
				char ch = s1.charAt(i);
				arr[ch-'a']++;
			}
			for(int i=0;i<len2;i++) {
				char ch = s2.charAt(i);
				arr[ch-'a']--;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					flag = 1;
					break;
				}
				else {
					flag = 0;
				}
			}
			if(flag==0) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}
		}
		
	
	}
}
 