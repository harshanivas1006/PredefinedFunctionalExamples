package collectionExample;
import java.util.Scanner;
public class EvenProgram {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print("Even Number");
			}
			else
			{
				System.out.print("Odd Number");
			}
			
		}
	}
}
