package hotel;

public class Customer {
	private int id;
	private String name,email,location;
	private String phone;
	public Customer(int id, String name, String email, String location, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + ", phone="
				+ phone + "]";
	}
	
	
}
