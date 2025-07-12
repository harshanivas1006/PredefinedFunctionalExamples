package javaeightexamples;
interface Funin{
	int apply(String s);
}
public class Funimpl implements Funin{
	public int apply(String s) {
		return s.length();
	}
	public static void main(String[] args) {
		Funimpl obj = new Funimpl();
		System.out.println(obj.apply("Hii"));
	}

	

}
