package collectionExample;
import java.util.Scanner;
public class Fibanoociprogram2 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		while(a<=n)
		{
			System.out.print(a+" ");    
			int c=a+b;
			a=b;
			b=c;
//			System.out.print(a+" ");       if you dont zero in series print here
		}
	}
}
