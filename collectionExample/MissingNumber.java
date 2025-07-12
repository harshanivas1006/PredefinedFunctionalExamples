package collectionExample;

import java.util.HashSet;

public class MissingNumber {
	public static void main(String[]args) {
		Integer a[]= {1,3,7,9,5,8,6};
		 missingNumbers(a);
	}	

	public static void missingNumbers(Integer[] a) {
		HashSet<Integer> h1=new HashSet<Integer>();
		for(int num : a) {
			h1.add(num);
		}
		
		int n=a.length+1;
		for(int i=0;i<n;i++) {
			if(!h1.contains(i)) {
				System.out.println(i+" ");
			}
		}
	}
}
