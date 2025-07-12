package javaeightexamples;
interface I{
	int m1(int Speed);
}
class B implements I{
	int speed=50;
	public int m1(int Speed) {
		System.out.println("Hello ");
		return speed;
	}
}
public class A {

	public static void main(String[] args) {
		B obj2=new B();
		System.out.println(obj2.m1(50));
		I obj=new I()
		{
			public int m1(int speed) {
				System.out.println("Hiii ");
				return 80;
			}
		};
		obj.m1(50);
		I obj1= speed -> { 
			int s=100;
			System.out.println("M1 Method");
			System.out.println("Car is Driving at speed "+speed);
				if(speed>100) {
					System.out.println("Fast Driving");
					return speed;
				}
				else {
					System.out.println("Normal Speed");
					return s;
				}
			};
			System.out.println(obj1.m1(100));
	}
}