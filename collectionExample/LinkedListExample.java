package collectionExample;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class LinkedListExample{
	public static void main(String[]args) {
		List<String> ll=new LinkedList<String>();
		ll.add("Rahul Gandhi");
		ll.add("Sonia Gandhi");
		ll.add("Priyanka gandhi");
		ll.add("Narendra Modi");
		System.out.println("After getting the elements : "+ll);
		System.out.println();
		String s="";
		System.out.print("Using For loop : ");
		for(int i=0;i<ll.size();i++) {
			System.out.print(s+ll.get(i));
			s=", ";
		}
		System.out.println();		System.out.println();
		ll.set(2, "Priyanka Gandhi");
		System.out.println("After updating the element : "+ll);
		System.out.println();
		Iterator itr=ll.iterator();
		String r="";
		System.out.print("Using Iterator : ");
		for(String t:ll) {
			System.out.print(r+t);
			r=", ";
		}
		System.out.println();
		System.out.println();
		int i=0;
		String I="";
		System.out.print("Using While Loop : ");
		while(i<ll.size()) {
			System.out.print(I+ll.get(i));
			i++;
			I=", ";
		}
		System.out.println();
		System.out.println();
		Collections.sort(ll);
		System.out.println("After Sorting the List : "+ll);
		
	}
}