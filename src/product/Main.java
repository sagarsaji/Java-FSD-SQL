package product;

import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p = new Products("sasi",100000,101);
		Products p1 = new Products("abu",1000,102);
		Products p2 = new Products("kodiyan",100,103);
		
		List<Products> s = Arrays.asList(p,p1,p2);
		List<Products> a = s.stream().filter(t->t.getPrice()<10000).toList();
		System.out.println(a);
		}

}
