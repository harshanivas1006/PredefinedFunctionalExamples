package collectionExample;
import java.util.*;
import java.util.stream.Collectors;
public class Frequencyofstringsinstrems {
	public static void main(String[] args) {
	     String s = "vamsikrishnareddy";
	     Map<Character, Long> freq = s.chars()                      // convert to IntStream
	                .mapToObj(c -> (char) c)                               // convert int to char
	                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // group and count
	     System.out.println(freq);
	}
}
