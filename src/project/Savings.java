package project;

public class Savings extends Account {
	private double minimumBalance;

	public Savings(int accNum, double balance, Customer customerObj, double minimumBalance) {
		super(accNum, balance, customerObj);
		this.minimumBalance = minimumBalance;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(balance-amount > minimumBalance) {
			balance-=amount;
			return true;
		}
		else
		{
			return false;
		}
	}
}
