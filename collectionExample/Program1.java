package collectionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<Integer> list2=list;
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list.add(40);
		
		System.out.println(list);//1,2,3,4,10,20,30,40
		System.out.println(list2);//1,2,3,4,10,20,30,40
		
	}

}
