package prac;

public class maxminnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "grass is greener on the other side";
		String s = s1.replace(" ", "");
		int[] arr = new int[26];
		
		char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum occuring character : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				System.out.println(alpha[i]);
			}
		}
		
		System.out.println("Max value : " + max);
		
		int min = max;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min && arr[i] != 0) {
				min = arr[i];
			}
		}

		System.out.println("\nMinimum occuring characters : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				System.out.println(alpha[i]);
			}
		}
		System.out.println("Minimum value : " + min);
	}
}
