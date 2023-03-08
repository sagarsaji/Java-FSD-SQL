package collections;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		String s;
		Scanner n = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter details : ");
		for(int i=0;i<3;i++)
		{
			s = n.next();
			list.add(s);
		}
		System.out.println(list);
	}

}
