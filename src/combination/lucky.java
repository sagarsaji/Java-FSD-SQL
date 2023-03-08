package combination;

import java.util.Scanner;
public class lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,flag=0;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a 4 digit number : ");
		num = n.nextInt();
		while(num>0) {
			rem = num%10;
			if(rem==3||rem==6||rem==9) {
				flag+=1;
				
			}
			num = num/10;
		}
		
		if(flag==4) {
			System.out.println("lucky");
		}
		else {
			System.out.println("not lucky");
		}
		n.close();
	}

}
