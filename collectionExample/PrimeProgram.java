package collectionExample;
import java.util.Scanner;
public class PrimeProgram {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int factorCount=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				factorCount++;
			}
		}
		if(factorCount==2)
		{
			System.out.print("Prime Number");
		}
		else
		{
			System.out.print("Not Prime Number");
		}
	}
}
