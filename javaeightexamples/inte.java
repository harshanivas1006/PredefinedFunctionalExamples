package javaeightexamples;

import java.util.Arrays;
import java.util.List;

interface inti{
	int apply(List s);
}
public class inte {
	public static void main(String[]args) {
		inti obj=(s)->s.size();
		List<String> names =Arrays.asList("SG","PG","RG");
		System.out.println(obj.apply(names));
	}
}
