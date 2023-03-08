package project;

public abstract class Account {
	protected int accNum;
	protected double balance;
	protected Customer customerObj;
	public Account(int accNum, double balance, Customer customerObj) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.customerObj = customerObj;
	}
	
	
	
	public int getAccNum() {
		return accNum;
	}



	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public Customer getCustomerObj() {
		return customerObj;
	}



	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}



	public abstract boolean withdraw(double amount);
}
