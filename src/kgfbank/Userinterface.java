package kgfbank;

import java.util.Scanner;
public class Userinterface {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("1.Savings Account\n2.Current Account\nEnter your Choice: ");
		int choice,bal;
		String acno;
		float year;
		String cname;
		choice = n.nextInt();
		System.out.println("\nEnter the Account Number : ");
		acno = n.next();
		System.out.println("Enter the customer Name : ");
		cname = n.next();
		System.out.println("Enter the balance amount : ");
		bal = n.nextInt();
		System.out.println("Enter the number of years : ");
		year = n.nextFloat();
		
		Account a = new Account(acno,cname,bal);
		SavingsAccount s = new SavingsAccount(acno,cname,bal);
		CurrentAccount c = new CurrentAccount(acno,cname,bal);
		
		System.out.println("Customer Name : "+" "+a.getCustomerName());
		System.out.println("Account Name : " + " "+a.getAccountNum());
		System.out.println("Balance : "+ " "+a.getBalance());
		
		if(choice==1) {
			System.out.println("Maintenance Charge : "+" "+c.calculateMaintenanceCharge(year));
		}
		else if(choice==2) {
			System.out.println("Maintenance Charge : "+" "+s.calculateMaintenanceCharge(year));
		}
		else
		{
			System.out.println("Invalid choice");
		}
		n.close();
	}
	

}
