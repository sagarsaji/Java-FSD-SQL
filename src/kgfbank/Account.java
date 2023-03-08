package kgfbank;

public class Account {
	private String accountNum,customerName;
	private double balance;
	public Account(String accountNum, String customerName, double balance) {
		super();
		this.accountNum = accountNum;
		this.customerName = customerName;
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
