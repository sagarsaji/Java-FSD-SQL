package practisee;

import java.util.Scanner;

public class Exceptionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		exception e1 = new exception("984712645",23000,"sasi@gmail.com","lakoor pta","sasi","pta",001);
		
		String s1 = n.next();
		e1.setPhno(s1);
		
		
		
		try {
			if(!e1.getPhno().matches("\\d{10}$")) 
				throw new invalidNumberExcep("invalid phone number");
			
			String s2 = n.next();
			e1.setEmailid(s2);
			
			try {
				if(!e1.getEmailid().matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]+$"))
					throw new emailexcept("email not in propper format");
			}
			catch(Exception f) {
				System.err.println(f.getMessage());
			}
			
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
		
		
	}
	public static class invalidNumberExcep extends Exception{
		public invalidNumberExcep(String m) {
			super(m);
		}
	}
	
	public static class emailexcept extends Exception{
		public emailexcept(String m) {
			super(m);
		}
	}

}
