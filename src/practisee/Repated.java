package practisee;

import java.util.Arrays;
import java.util.List;

public class Repated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love Love to To tO code";
		//String s1 = "";
		String s2 = s.toLowerCase();
		String[] s3=s2.split(" ");
		
		List<String> ls = Arrays.asList(s3);
		
		List<String> lss = ls.stream().distinct().toList();
		
		String[] lsttostr = lss.toArray(new String[lss.size()]);
		StringBuilder builder = new StringBuilder();
		}
		
	}

}
