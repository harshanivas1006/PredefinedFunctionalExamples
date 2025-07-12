package javaeightexamples;

interface Testi{
	void SquareIt(int n);
}
public class Test {
	public static void main(String[] args) {
		Testi obj=(n)->System.out.println(n*n);
//		Function<Integer,Integer> obj1=n->n*n;
//		System.out.println(obj1.apply(5));
		obj.SquareIt(10);
		obj.SquareIt(20);
	}

}
//USER DEFINED FUNTIONAL INTERFACE