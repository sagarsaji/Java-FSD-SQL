package sum;

import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,arr[];
		arr = new int[20];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = s.nextInt();
		if(n<1)
		{
			System.out.println("Invalid range");
			
		}
		else {
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			arr[i+1]+=arr[i];	
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		}
		s.close();
	}
	

}
