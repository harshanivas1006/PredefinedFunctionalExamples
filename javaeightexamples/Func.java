package javaeightexamples;
interface Funci{
	int apply(String s);
}
public class Func {

	public static void main(String[] args) {
		Funci obj=(s) -> s.length();
		System.out.println(obj.apply("Harsha"));
	}

}
