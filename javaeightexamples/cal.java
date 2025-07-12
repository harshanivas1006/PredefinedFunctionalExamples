package javaeightexamples;
interface calI{
	int sum(int a,int b);
}

public class cal implements calI{

	public int sum(int a, int b) {
		return 10;
	}
	public static void main(String[]args) {
		calI obj=(a,b) -> a+b;
		System.out.println(obj.sum(10, 20));
	}

}
