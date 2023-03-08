package hashmap;

import java.util.HashMap;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("sagar",22);
		map.put("sasi", 21);
		map.put("abu", 23);
		map.put("abc",2);
		
		int age = map.get("sagar");
		System.out.println("the age of sagar : "+age);
		
		boolean conteins = map.containsKey("sasi");
		System.out.println("hashmap contains sasi : "+conteins);
		
		map.remove("abc");
		System.out.println("updated list : "+map);
		
		for(String name:map.keySet()) {
			int value = map.get(name);
			System.out.println(name+" "+"is "+value+" "+"years old");
		}
		
	}

}
