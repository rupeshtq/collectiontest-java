package TestonHashmap;


import java.util.HashMap;
import java.util.LinkedList;/*
9.	 There is a linked list which contains numbers from 1 to 5 . { 1,4,2,1,3,1,4} . 
Create a map which contains string which is number in words and number of times that
number has appeared in list? E.g. output map for above list will be map { (“one”,3)
	,(“two”,1),(“three” , 1),(“four”,2)}. Make use of switch statement to get number in words.
*/
public class Q9LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(1);
		ll.add(4);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(1);
		ll.add(4);
		System.out.println(ll);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int  c= 0,c1 = 0, c2 = 0, c3 = 0;
		for(Integer i : ll)
		{
			int x = i;
			switch(x)
			{
			case 1:
				c++;
				hm.put("One", c);
				break;
			case 2:
				c1++;
				hm.put("Two", c1);
				break;
			case 3:
				c2++;
				hm.put("Three", c2);
				break;
			case 4:
				c3++;
				hm.put("Four", c3);
				break;
			}
		}
		System.out.println(hm);
	}

}
