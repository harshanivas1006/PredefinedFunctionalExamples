package collectionExample;
import java.util.Scanner;
public class palindrome {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int reverse=0;
			int t=n;
			while(n>0)
			{
				int r=n%10;
				reverse = reverse*10+r;
				n=n/10;
			}
			if(reverse==t)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		}
}
