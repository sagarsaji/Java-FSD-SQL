package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class substrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		ArrayList<Character> lst = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			lst.add(s.charAt(i));
		}
		List<Character> lstt = lst.stream().distinct().toList();
		System.out.println(lstt.size());
	}

}
