package practisee;

public class Rect implements Shapes {
	public int area(int a,int b) {
		//System.out.println("hi");
		return (a*b);
	}
	
	public int perimeter(int x,int y) {
		return 2*(x+y);
	}
}
