package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection {
	
	public static void main(String args[]) {
		
		List l1=new ArrayList();
		l1.add("virat");
		l1.add("Rohit");
		l1.add("Dhoni");
		l1.add("Kohli");
		String s="";
		for(int i=0;i<l1.size();i++) {
			System.out.print(s+l1.get(i));
			s=", ";
		}
		System.out.println();
		l1.remove(0);
		System.out.println("After removing the element : "+l1);
		l1.set(0, "Virat");
		System.out.println("After Adding the element : "+l1);
		l1.add(0,"Rohit");
		System.out.println("After removing the element : "+l1);
		System.out.println("After getting the element : "+l1.get(3));
		l1.add(1, "Kohli");
		System.out.println("After removing the element : "+l1);
		l1.set(0, "Rishabh");
		System.out.println("After removing the element : "+l1);
	}

}
