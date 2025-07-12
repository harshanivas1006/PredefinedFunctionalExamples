package javaeightexamples;

import java.util.function.Predicate;
//interface pf{
//	int test(String i);
//}
public class predictae {
	public static void main( String[]args) {
		Predicate<String> p= i -> i.length()>5;
		System.out.println(p.test("Rahul Gandhi")); //true
		System.out.println(p.test("Sai")); // False
	}
}
