package product;

public class Products {
	private String name;
	private int price,id;
	public Products(String name, int price, int id) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
	}
	@Override
	public String toString() {
		return "sASi[name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
