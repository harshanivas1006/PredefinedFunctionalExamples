package javaeightexamples;

import java.util.Arrays;
import java.util.List;

interface Consumeri{
	void accept(List enames);
}
public class ConsumerEx {
	public static void main( String [] args) {
		List<String> names = Arrays.asList("Rahul","Sg","pg");
		Consumeri c1=enames ->{}; // User Defined FI
		c1.accept(names); 
		Consumeri c2 = enames -> {}; // Pre Defined FI
		c2.accept(names);
	}

}
