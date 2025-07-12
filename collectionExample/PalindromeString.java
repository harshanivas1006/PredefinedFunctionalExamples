
//import java.util.Scanner;
//public class PalindromeString {
//	public static void main(String args[])
//	{
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		String t=" ";
//		for(int i=0;i<s.length();i++)
//		{
//			t=s.charAt(i)+t;
//			if(s.equalsIgnoreCase(t))
//			{
//				System.out.print("Palindrome");
//			}
//			else
//			{
//				System.out.print("Not Plaindrome");
//				break;
//			}
//		}
//	}
//}

package collectionExample;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        
        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}
