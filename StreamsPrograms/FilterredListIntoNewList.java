package StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterredListIntoNewList {

	public static void main(String[] args) {
		
		  List<String> l1 = Arrays.asList("Harsha", "Nivas", "John", "Kiran");

	        List<String> result = l1.stream()
	                                   .filter(name -> name.startsWith("K"))
	                                   .collect(Collectors.toList());

	        System.out.println(result);
	}
}
