package practice;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=20;i++) {
			int flag = 1;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					flag = 0;
					break;
				}
			}
			if(flag==1) {
				System.out.println(i);
			}
		}
		
	}

}
