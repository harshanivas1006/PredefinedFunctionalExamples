package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al1=new ArrayList();
		al1.add(52);
		al1.add("sai");
		al1.add(25);
		al1.add(8875);
		System.out.println(al1);
		List<Integer> al2=new ArrayList<Integer>();
		al2.add(78);
		al2.add(52);
		al2.add(452);
		al2.add(8965);
		System.out.println(al2);
		ArrayList<String> al3= new ArrayList<String>();
		al3.add("pawan kalyan");
		al3.add("Ram charan");
		al3.add("NTR");
		al3.add("Mega star");
		System.out.println(al3);
		al1.remove(0);
		System.out.println("After removing the element: "+al1);
		al1.addAll(al2);
		System.out.println(al1);
		al1.removeAll(al2);
		System.out.println(al1);
		al1.set(0, 52);
		System.out.println(al1);
		al1.add(1, "sai");
		System.out.println(al1);
		System.out.println(al1.get(0));
		ArrayList al4=new ArrayList();
		al4.add(100);
		al4.add("Ram..");
		System.out.println(al4);
		ArrayList<String> al5=new ArrayList<String>();
		al5.add("Vamsi");
		al5.add("Krishna");
		al5.add("RAM Sai");
		System.out.println(al5);
		al5.remove(1);
		System.out.println(al5);
		al5.add(1, "Krishna");
		System.out.println(al5);
		System.out.println(al5.get(0));
		String s="";
		for(int i=0;i<al1.size();i++)
			
		{
			System.out.print(s+al1.get(i)); 
			s=", ";
		}
		String t=" ";
		for(Object ob:al2)
		{
			System.out.print(t+ob);
			t=", ";
		}
		String h=", ";
		Iterator<String> it=al3.iterator();
		while(it.hasNext())
		{
			System.out.print(h+it.next());
			h=", ";
		}
		System.out.println();
		ArrayList al6=new ArrayList();
		al6.add("Vamsi");
		al6.add("Sai Muthyala");
		al6.add("Somu");
		System.out.println(al6);
		al6.add(3,"Ram Sai");
		System.out.println(al6);
		al6.remove(0);
		System.out.println("After removing the zeroth index :"+al6);
		al6.add(0,"vamsi");
		System.out.println("After adding the zeroth element :"+al6);
		al6.get(0);
		System.out.println(al6.get(0));
		System.out.println("After getting the element : "+al5.get(2));
		System.out.println("After getting the element : "+al6.get(2));
		System.out.println("After getting the element : "+al4.get(1));
		al4.add(2,"Sai..");
		System.out.println(al4);
		System.out.println("After getting the element : "+al4.get(2));
		System.out.println("After getting the element : "+al4);
		String s1="";
		for(int i=0;i<al4.size();i++)
		{
			System.out.print(s+al4.get(i));
			s1=", ";
		}
		String y="";
		for(Object ob:al6) {
			System.out.print(y+ob+" ");
			y=", ";
		}
		System.out.println();
		al1.set(1,"SAI");
		System.out.println(al1);
		al1.add(1,25);
		System.out.println(al1);
	}
}
