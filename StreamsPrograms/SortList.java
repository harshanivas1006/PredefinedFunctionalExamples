package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(2,5,4,3,1);
		l1.stream()
		.sorted()
		.forEach(System.out::println);
	}

}
