package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Meow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner n = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		int n1 = n.nextInt();
		for(int i=0;i<n1;i++){
			String s1 = n.next();
			arr.add(s1);
		}
		List<String> lst1 = new ArrayList<>();
		for(String s: arr) {
			if(s.matches("[mM]+[eE]+[oO]+[wW]+")) {
				lst1.add("YES");
			}
			else {
				lst1.add("NO");
			}
		}
		System.out.print(lst1);
	}
}
