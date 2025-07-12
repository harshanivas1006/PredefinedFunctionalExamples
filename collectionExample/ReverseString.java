package collectionExample;

import java.util.Scanner;
public class ReverseString {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	  String s1="";
	  for(int i=0;i<s.length();i++)
	  {
		char ch=s.charAt(i);
		s1=ch+s1;
		
	  }
	  System.out.println(s1);
  }
}
