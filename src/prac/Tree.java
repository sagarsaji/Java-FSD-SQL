package prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	 public String toString() {
	        return data+"->"+left+"->"+right+"\n";
	    }
	
}

public class Tree {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,9,4,null,5,7,8,9,null,null,2,11,30,null,40,50};
		int home = 9;
		int k = 1;
		List<Node> lst = new ArrayList<>();
		ArrayList<Integer> visited = new ArrayList<>();
		int count = 0;
		//Node root = new Node(arr[0],null,null);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				continue;
			}
			Node val = new Node(arr[i],null,null);
			count++;
			int j = count;
			while(j<=count+1 && j<arr.length) {
				if(!visited.contains(arr[j])) {
					if(j<arr.length && arr[j]!=null) {
						Node left = new Node(arr[j],null,null);
						val.left = left;
					}
					j++;
					count++;
					visited.add(arr[i]);
					if(j<arr.length && arr[j]!=null) {
						Node right = new Node(arr[j],null,null);
						val.right = right;
					}
					j++;
					count++;
					visited.add(arr[i]);
				}
			}
			lst.add(val);
		}
		System.out.println(lst);
	}

}
