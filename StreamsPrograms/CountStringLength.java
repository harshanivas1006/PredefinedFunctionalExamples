package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class CountStringLength {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("ab","abc","abcd","abcd");
		Long count=l1.stream()
		.filter(s->s.length()>3)
		.count();
		System.out.println(count);
	}

}
