package collectionExample;
import java.util.Scanner;
public class duplicateExample 
{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='0';
					count++;
				}
			}
			if(count<=0 && ch[i]!='0')
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
}