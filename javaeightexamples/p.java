package javaeightexamples;
interface pi{
	boolean  test(String s);
}
public class p implements pi {
	
	public  boolean test(String s) {
		
		return s.length()>5;
	}
	public static void main(String[] args) {
		pi obj  = new p();
		System.out.println(obj.test("Harsha Nivas"));
	}
}
