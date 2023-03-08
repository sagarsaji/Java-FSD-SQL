package positiveneg;

public class Posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,-4,6,8,-9,0,4,-7,56};
		int len = arr.length;
		int c1=0,c2=0;
		for(int i=0;i<len;i++) {
			if(arr[i]<0) {
				c1++;
			}
			else if(arr[i]>0){
				c2++;
			}
			
		}
		
			
			System.out.println("Negative values: "+ c1);
			System.out.println("Positive values : "+ c2+"\n");
		
	}

}
