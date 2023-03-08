package kgfbank;

public class CurrentAccount extends Account implements MaintenanceCharge {

	public CurrentAccount(String accountNum, String customerName, double balance) {
		super(accountNum, customerName, balance);
		// TODO Auto-generated constructor stub
	}
	
	
	float m = 100;
	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		float n=noOfYears;
		float charge;
		charge = ((m*n) + 200);
		return charge;
	}
	
	
	
}
