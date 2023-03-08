package fileio;

import java.io.FileOutputStream;
public class FileOutputStream1 {

	public static void main(String[] args) {
		String s = "Welcome to ust";
		byte b[] = s.getBytes();
		try {
			FileOutputStream fout=new FileOutputStream("D://text.txt");
			
			fout.write(b);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
