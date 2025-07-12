package collectionExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arr {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("Harsha");
		l1.add("Nivas");
		l1.add("Vamsi");
		l1.add("Krishna");
		l1.add("Sai");
		l1.add(1);
		l1.remove(5);
		System.out.println(l1);
		l1.remove(0);
		System.out.println("After removing the first element : "+l1);
		l1.add(0,"Harsha");
		System.out.println(l1);
		l1.set(0, "Padavala");
		System.out.println("After set the first element : "+l1);
		l1.clear();
		System.out.println("After clearing the all elements : "+l1);
		l1.add(0, "Harsha");
		l1.add(1,"Nivas");
		l1.add(2,"Vamsi");
		l1.add(3,"krishna");
		l1.add(4,"Sai");
		System.out.println("After adding all teh elements : "+l1);
		String s="";
		for(int i=0;i<l1.size();i++) {
			System.out.print(s+l1.get(i));
			s=", ";
		}
		System.out.println();
		List<Integer> l2=new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		System.out.println(l2);
		l2.clear();
		System.out.println("After clearing the all the elements : "+l2);
		System.out.println(l2.isEmpty());
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		System.out.println("After adding the elements"+l2);
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l2);
		l1.remove(6);
		l1.remove(5);
		l1.remove(7);
		l1.remove(6);
		l1.remove(5);
		System.out.println("After removing the adding elements : "+l1);
		String t="";
		for (Object name:l1) {
			System.out.print(t+name);
			t=", ";
		}
		System.out.println();
		String str="";
		for(Object num:l2) {
			System.out.print(str+num);
			str=", ";
		}
		System.out.println();
		Collections.sort(l1);
		System.out.println("After sorting the elements : "+l1);
		System.out.println("Size of the list : "+l1.size());
		ArrayList l3=new ArrayList();
		l3.add("Rahul Gandhi");
		l3.add("Sonia Gandhi");
		l3.add("Priyanka Gandhi");
		l3.add("Narendra Modi");
		String o="";
		for(Object ob:l3) {
			System.out.print(o+ob);
			o=", ";
		}
		System.out.println();
		String g="";
		Iterator itr=l3.iterator();
		while(itr.hasNext()) {
			System.out.print(g+itr.next());
			g=", ";
		}
		System.out.println();
		String r="";
		for(int i=0;i<l3.size();i++)
		{
			System.out.print(r+l3.get(i));
			r=", ";
		}
		System.out.println();
	}

}
