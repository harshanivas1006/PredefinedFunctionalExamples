package javaeightexamples;

import java.util.function.Function;

interface uf1{
	int SquareIt(int n);
}
public class uf {
	public static void main(String[] args) {
		Function<Integer,Integer> obj=(n)-> n*n;
		System.out.println(obj.apply(10));
	}

}
//PRE DEFINED FUNCTIONAL INTERFACE