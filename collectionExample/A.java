package collectionExample;

interface I{
	void m1(int a,int b);
}

public class A{
	public static void main(String[] args) {
		I obj=(a,b)->System.out.println(a*b);
		obj.m1(10,5);
	}
}
