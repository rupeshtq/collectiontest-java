package TestonHashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Q5DivisibleByThree {
		/*
		 Create a Linkedhashmap<int,String> where key is integers 1 to 10 and 
		 string is number in words.Remove entry for which number is divisible by 
		 3.
		 */


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			LinkedHashMap<Integer,String>a=new LinkedHashMap<>();
			a.put(1,"One");
			a.put(2,"Two");
			a.put(3,"Three");
			a.put(4,"Four");
			a.put(5,"Five");
			a.put(6,"Six");
			a.put(7,"Seven");
			a.put(8,"Eight");
			a.put(9,"Nine");
			a.put(10,"Ten");
			

			Iterator<Integer> itr = a.keySet().iterator();
			while(itr.hasNext())
			{
				int i = itr.next();
				if(i % 3 == 0)
					itr.remove();
				else
					System.out.println(i+"  "+a.get(i));
			}
		}
		}
