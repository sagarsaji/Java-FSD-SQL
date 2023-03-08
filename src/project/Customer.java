package project;

public class Customer {
	private int customerid;
	private String customerName,email;
	public Customer(int customerid, String customerName, String email) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.email = email;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
