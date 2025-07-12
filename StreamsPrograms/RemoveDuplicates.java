package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[]args) {
		List<Integer> l1=Arrays.asList(1,2,3,1,4,2);
		l1.stream()
		.distinct()
		.forEach(System.out::println);
	}

}
