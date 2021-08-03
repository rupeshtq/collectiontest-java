package TestonHashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Q7 {
		//7.	Create a Map which contain Integer as key and Another Map as Value another Map 
		//Contain String as Key and Integer as value print the Map using Iterator.
		public static <hm> void main(String[] args) {
			HashMap<String,Integer >hm= new HashMap<>();
			hm.put("Akash", 1);
			hm.put("Jayant", 2);
			hm.put("Ishwar", 3);
			HashMap<String,Integer >hm1= new HashMap<>();
			hm1.put("Rajiv", 4);
			hm1.put("Jayesh", 5);
			hm1.put("Harshal", 6);
			//System.out.println(hm);
			
			HashMap<Integer,HashMap<String,Integer> >hm2= new HashMap<>();
			hm2.put(101, hm);
			hm2.put(102, hm1);
			
			
			Iterator<Integer> it = hm2.keySet().iterator();
			while(it.hasNext())
			{
					int a = it.next();
					System.out.println(a +" "+hm2.get(a));
			}
			
				
	}}

