package cafe;

public class Emplo {
	private int uid;
	private String name;
	public Emplo(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emplo [uid=" + uid + ", name=" + name + "]";
	}
	
	
}
