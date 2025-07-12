package javaeightexamples;
interface I1{
	public int m1(int a);
}
class Audi implements I1{
	
	@Override
	public int m1(int a) {
		System.out.println("Driving Audi");
		return 100;
	}
}
public class Nivas {

	public static void main(String[] args) {
		Audi obj=new Audi();
		obj.m1(50);
		I1 obj2=(a)-> {
			int speed=100;
				System.out.println("Driving Bmw");
				System.out.println("Car Driving at speed "+speed);
			if(speed>100) {
				System.out.println("Rash Driving");
				return speed;
			}
			else {
				System.out.println("Normal Driving");
				return speed;
			}
		};
		System.out.print(obj2.m1(80));
	}

}
