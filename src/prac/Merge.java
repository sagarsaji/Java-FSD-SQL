package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int s1,s2;
		s1 = n.nextInt();
		s2 = n.nextInt();
		int[] a1 = new int[s1];
		int[] a2 = new int[s2];
		int index = 0;
		int[] a3 = new int[s1+s2];
		for(int i=0;i<s1;i++) {
			a1[i] = n.nextInt();
		}
		
		for(int i=0;i<s2;i++) {
			a2[i] = n.nextInt();
		}
		for(int i=0;i<s1;i++) {
			a3[index] = a1[i];
			index++;
		}
		for(int i=0;i<s2;i++) {
			a3[index] = a2[i];
			index++;
		}
		for(int i=0;i<index;i++){
	        for(int j=0;j<index-i-1;j++){
	            if(a3[j]<a3[j+1]){
	                int temp = a3[j];
	                a3[j] = a3[j+1];
	                a3[j+1] = temp;
	            }
	        }
	    }
	    for(int i=0;i<index;i++){
	        System.out.println(a3[i]);
	    }
		
	}

}
