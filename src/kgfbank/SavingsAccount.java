package kgfbank;

public class SavingsAccount extends Account implements MaintenanceCharge{

	public SavingsAccount(String accountNum, String customerName, double balance) {
		super(accountNum, customerName, balance);
		// TODO Auto-generated constructor stub
	}
	
	
	float m = 50;
	
	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		float n=noOfYears;
		float charge;
		charge = ((m*n) + 50);
		return charge;
	}

	
}
