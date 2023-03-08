package hashmap;

import java.util.Objects;

//import java.util.HashMap;

public class Employee {
	
	private int id,age;
	private String department,name;
	
	public Employee(int id, int age, String department, String name) {
		super();
		this.id = id;
		this.age = age;
		this.department = department;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, department, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	


}
