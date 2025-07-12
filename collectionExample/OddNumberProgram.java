package collectionExample;
import java.util.Scanner;
public class OddNumberProgram {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2==1)
			{
				System.out.print("Odd Number");
				break;
			}
			
		}
	}
}
