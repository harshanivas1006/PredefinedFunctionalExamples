package StreamsPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
	public static void main(String[] args) {
		   String s = "Padavala Harsha Nivas";

	      String result=Arrays.stream(s.split(" "))
	    		  .map(word->new StringBuilder(word).reverse().toString())
	    		  .collect(Collectors.joining(" "));
	      System.out.println(result);
		
	}
}
