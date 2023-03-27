package prac;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int sizee;
		System.out.println("Enter size : \n");
		sizee = n.nextInt();
		int[] number = new int[sizee];
		ArrayList<Integer> listt = new ArrayList<>();
		System.out.println("Enter elements : \n");
		for(int i=0;i<sizee;i++) {
			number[i] = n.nextInt();
			listt.add(number[i]);
		}
		int count = 0;
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i=0;i<sizee;i++) {
			for(int j=1;j<=listt.get(i);j++) {
				if(listt.get(i)%j==0) {
					count++;
				}
			}
			lst.add(count);
			count = 0;
		}
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<sizee;i++) {
			map.put(listt.get(i), lst.get(i));
		}
		List<Integer> lstt = map.entrySet().stream().filter(t->t.getValue()==2).map(Map.Entry::getKey).toList();
		System.out.println("Prime numbers are : \n");
		lstt.forEach(t->System.out.println(t));
	}

}
