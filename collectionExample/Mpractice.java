package collectionExample;
import java.util.*;

public class Mpractice {
	public static void main(String args[]) {
		Hashtable<Integer,String> m=new Hashtable<>();
//		m.put(1, "Harsha");
//		m.put(2, "Nivas");
//		m.put(3, "Ramsai");
//		
//		System.out.println(m);
//		
//		Set<Integer> keys=m.keySet();
//		for(Integer key:keys)
//		{
//			System.out.println(key);
//		}
//		Collection<String> values=m.values();
//		for(String value:values) {
//			System.out.println(value);
//		}
//		System.out.println();
//		System.out.println(m.get(1));
//		for(Integer key:keys) {
//			System.out.println(key+" >>>>>>> "+m.get(key));
//		}
//		m.remove(1);
//		System.out.println(m);
//		System.out.println(m.containsKey(2));
//		System.out.println(m.containsKey(1));
//		System.out.println(m.containsValue("Nivas"));
//		System.out.println(m.containsValue("Ramsai"));
//		System.out.println(m.containsValue("Harsga"));
//		System.out.println(m);
//		m.put(1, "Harsha");
//		System.out.println(m);
//		m.putIfAbsent(1, "NIVASHG");
//		System.out.print(m.size());
		m.put(1, "Harsha");
		m.put(2, "Nivas");
		m.put(3, "Vamsi");
		m.put(4, "Krishna");
		System.out.println(m);
		Set<Integer> keys=m.keySet();
		for(Integer key:keys) {
			System.out.println(key);
		}
		Collection<String> values=m.values();
		for(String value:values) {
			System.out.println(value);
		}
		for(Integer key:keys)
		{
			System.out.println(key+" >>>>> "+m.get(key));
		}
		m.remove(1);
		System.out.println(m);
		System.out.println(m.containsKey(2));
		System.out.println(m.containsValue("Nivas"));
		m.put(1, "Harsha");
		System.out.println(m);
		m.putIfAbsent(1, "Nivggs");
		System.out.println(m.size());
	}
}
