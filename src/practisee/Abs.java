package practisee;

public class Abs {

	public abstract class Shapes{
		
		public abstract int area(int x,int y);
		
		public abstract int perimeter(int z);
		
	}
	
	
	public class Rect extends Shapes {
		
		public int area(int a,int b) {
			return a*b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
