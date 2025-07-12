package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	public static void main(String[]args) {
		List<Integer> l1= Arrays.asList(10,15,20,25,30);
		l1.stream()
		.filter(i->i%2==0)
		.forEach(System.out::println);
	}

}
