package restaurent;

public class Costumer {
	private String id;
	private String name,phone,email,location;
	public Costumer(String id, String name, String phone, String email, String location) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	@Override
	public String toString() {
		return "Costumer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", location="
				+ location + "]";
	}
	
	
}
