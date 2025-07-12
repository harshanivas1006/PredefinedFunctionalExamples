package javaeightexamples;

import java.util.Arrays;
import java.util.List;

interface Functioni{
	int apply(List names);
}
public class Fun implements Functioni{
	bpublic int apply(List names) {
		return names.size();
	}
	public static void main(String[]args) {
		Fun obj=new Fun();
		List<String> names =Arrays.asList("SG","PG","RG");
		System.out.println(obj.apply(names));
	}
}