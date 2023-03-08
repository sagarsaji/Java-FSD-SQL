package restaurent;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int min,max;
		System.out.println("Enter min price : ");
		min = n.nextInt();
		System.out.println("Enter max price : ");
		max = n.nextInt();
		
		Minmax m1 = new Minmax("Zam Zam","Kulathoor",2500,1);
		Minmax m2 = new Minmax("BroCo","Tvm",5000,2);
		Minmax m3 = new Minmax("Sasi Hotel","Lakoor",500,3);
		Minmax m4 = new Minmax("Morgans","Kzk",12500,4);
		Minmax m5 = new Minmax("Amigoos","Palayam",3000,5);
		
		List<Minmax> lst = Arrays.asList(m1,m2,m3,m4,m5);
		List<Minmax> ls = lst.stream().filter(t->(t.getBudget()>=min)&&(t.getBudget()<=max)).toList();
		ls.forEach(t->System.out.println(t));
		
		System.out.println("\nChoose hotel id : ");
		int m = n.nextInt();
		
		
		List<Minmax> l = ls.stream().filter(t->t.getId()==m).toList();
		System.out.println(l);
		
		System.out.println("Registration form\n\n");
		
		System.out.println("\nEnter name : ");
		String nme = n.next();
		System.out.println("\nEnter id : ");
		String idd = n.next();
		System.out.println("\nEnter email id : ");
		String mail = n.next();
		System.out.println("\nEnter Location : ");
		String loc = n.next();
		
		System.out.println("\nDetails\n");
		System.out.println("Id : "+idd);
		System.out.println("Name : "+nme);
		System.out.println("Mail id : "+idd);
		System.out.println("Location : "+loc);
		
		
		l.forEach(t->System.out.println("Hotel Name : "+t.getHotelname()+"\n"+"Hotel Location : "+t.getLocation()+"\n"+"Hotel Budget : "+t.getBudget()));
	}

}
