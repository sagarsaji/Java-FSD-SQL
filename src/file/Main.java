package file;

//import java.io
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try {
			Scanner ss = new Scanner(System.in);
			String s;
			System.out.println("Enter a string : ");
			s = ss.nextLine();
			FileOutputStream fout = new FileOutputStream("D://filename.txt");
			byte b[] = s.getBytes();
			fout.write(b);
			
			FileInputStream f = new FileInputStream("D://filename.txt");
			int i=0,count=0;
			while((i=f.read())!=-1) {
				if(i == ' ')
				{
					count++;
				}
			}
			System.out.println("Number of words : "+(count+1));
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
