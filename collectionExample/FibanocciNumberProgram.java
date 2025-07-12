package collectionExample;
import java.util.Scanner;
public class FibanocciNumberProgram {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		while(a<n)
		{
			int c=a+b;
			a=b;
			b=c;
		}
		if(a==n)
		{
			System.out.print("Fibanocci Number");
		}
		else
		{
			System.out.print("Not Fibanocci Number");
		}
	}
}
