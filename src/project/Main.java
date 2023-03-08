package project;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer(100,"hai","hello@gmail.com");
		Savings sa = new Savings(1000,10000,c,500);
		
		if(sa.withdraw(9000)) {
			System.out.println(sa.getBalance());
		}

	}

}
