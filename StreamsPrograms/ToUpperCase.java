package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class ToUpperCase {

	public static void main(String[] args) {
		List<String>l1=Arrays.asList("harsha","nivas","padavala");
				l1.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);

	}

}
