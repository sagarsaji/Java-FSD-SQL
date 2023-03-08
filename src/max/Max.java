package max;

public class Max {

	public static void main(String[] args) {
		
		
		int arr[] = {5,3,8,1,7,2};
		int max= 0;
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
