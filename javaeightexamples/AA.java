package javaeightexamples;
interface ii{
	void login();
}

public class AA {
	public void login() {
		System.out.println("Start");
		
	}
	public static void main(String[] args) {
		ii obj=()->System.out.println("Login Success");
		obj.login();
	}
	
}
