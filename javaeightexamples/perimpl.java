package javaeightexamples;
interface perin{
	Boolean test(String s);
}
public class perimpl implements peri{
	public Boolean test(String s) {
		return s.contains("G");
	}
	public static void main(String[]args) {
		perimpl obj = new perimpl();
		System.out.println(obj.test("RAHUL GANDHI"));
	}

	
}
