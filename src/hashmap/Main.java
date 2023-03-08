package hashmap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		Employee e1 = new Employee(101,22,"dept1","sasi");
		Employee e2 = new Employee(102,21,"dept2","abu");
		Employee e3 = new Employee(103,23,"dept3","poombata");
		
		emp.put(1,e1);
		emp.put(2,e2);
		emp.put(3,e3);
		
//		int h1 = e1.hashCode();
//		int h2 = e2.hashCode();
//		int h3 = e3.hashCode();
		
		for(Integer k:emp.keySet()) {
			Employee e = emp.get(k);
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getAge());
			System.out.println(e.getDepartment());
			
		}
		
//		System.out.println(hashcode);
//		System.out.println(h2);
//		System.out.println(h3);
		
		
	}

}
