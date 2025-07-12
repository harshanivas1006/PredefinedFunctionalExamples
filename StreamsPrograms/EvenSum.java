package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(10,15,20,25);
		int sum=l1.stream()
				.filter(n->n%2==0)
				.mapToInt(n->n)
				.sum();
				System.out.print(sum);
	}

}
