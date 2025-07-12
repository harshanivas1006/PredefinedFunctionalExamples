package StreamsPrograms;

import java.util.List;
import java.util.Scanner;

public class LargestElementByUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[] {6,17,3,45,86,32,4,7};
		List<Integer> list=List.of(6,17,3,45,86,32,4,7);
		list.stream().sorted((x,y)->y.compareTo(x)).skip(n-1).limit(1).forEach(System.out::println);
		
	}
}
