package practice;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =12;
		int n2 = 8;
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
