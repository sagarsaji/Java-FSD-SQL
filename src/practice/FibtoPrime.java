package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FibtoPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int siz = n.nextInt();
		ArrayList<Integer> ar = new ArrayList<>();
		int n1=0,n2=1;
		for(int i=0;i<=1;i++) {
			if(i==0) {
				ar.add(0);
			}
			else if(i==1) {
				ar.add(1);
			}
		}
		for(int i=2;i<=siz;i++) {
			int sum = n1+n2;
			ar.add(sum);
			n1=n2;
			n2=sum;
		}
		ArrayList<Integer> prime = new ArrayList<>();
		System.out.print("fibonacci : "+ ar);
		int count=0;
		for(int i=0;i<ar.size();i++) {
			for(int j=1;j<=ar.get(i);j++) {
				if(ar.get(i)%j==0) {
					count++;
				}
			}
			if(count==2) {
				prime.add(ar.get(i));
				count=0;
			}
			else {
				count=0;
			}
		}
		System.out.print("\nprime : "+prime);
		
	}

}
