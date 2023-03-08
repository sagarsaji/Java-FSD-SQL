package hotel;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		int id;
		Customer c1 = new Customer(101,"sasi","sasi@gmail.com","lakkur","9847234567");
		Customer c2 = new Customer(102,"abu","abu@gmail.com","kochi","984712345");
		Customer c3 = new Customer(103,"kodiyan","kodiyan@gmail.com","kochi","984734567");
		Customer c4 = new Customer(104,"jabaa","jabaa@gmail.com","pathanamthitta","984724680");
		Customer c5 = new Customer(105,"finla","finla@gmail.com","lakkur","984714703");
		System.out.println("Enter id : ");
		id = n.nextInt();
		
		List<Customer> lst = Arrays.asList(c1,c2,c3,c4,c5);
		//System.out.println(lst);
		
		//int id = 101;
		int flag = 0;
		for(Customer c:lst) {
			if(id == c.getId()) {
				System.out.println(c.getName()+" "+c.getEmail()+" "+c.getLocation()+" "+c.getPhone());
				flag = 1;
				break;
			}
//			else {
//					flag = 0;
//				}
		}
		if(flag==0) {
			System.out.println("invalid");
		}
			
			

		
		
		
		
	}	

}
