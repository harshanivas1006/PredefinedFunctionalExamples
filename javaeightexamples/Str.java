package javaeightexamples;

import java.util.function.Function;

interface stri{
	int apply(String s);
}
public class Str {
	public static void main(String[] args) {
		stri obj=(s) -> s.length();
		Function<String,Integer> obj2 =(s)-> s.length();
		System.out.println(obj.apply("HARSHA"));
		System.out.print(obj2.apply("HELLO"));
	}

}
