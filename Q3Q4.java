package TestonHashmap;


	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;
	/*
	3.	Write a Java program to get a set of keys contained in map and print whole map using 
		iterator and for each loop.
	  */

	public class Q3Q4 {
			public static void main(String[] args) {
			
			HashMap<Integer,String >hm= new HashMap<Integer, String>();
			hm.put(1, "Akash");
			hm.put(2, "Yogesh");
			hm.put(3, "Sagar");
			hm.put(4, "Ankit");
			hm.put(5, "Ishwar");
			System.out.println(hm);
			
			
		Set<Integer>ss=hm.keySet();
		System.out.println(ss);
		System.out.println("\nUsing foreach loop");
		ss.forEach(t->System.out.println("Key-->"+t));
		
		System.out.println("\nUsing Iterator");
		Iterator<Integer>itr=ss.iterator();
		while(itr.hasNext())
		{
			Integer k=itr.next();
			System.out.println("Key--> "+k);
		}
	//4.	Write a Java program to get a set of entries contained in map and print whole map using 
	//iterator and for each loop.  

		Set<Entry<Integer ,String>>ee=hm.entrySet();
		System.out.println(ee);
		System.out.println("\nUsing foreach loop");
		ee.forEach(entry ->  System.out.println(entry.getKey() + " " + entry.getValue()));

		System.out.println("\nUsing Iterator");
	    Iterator it = ee.iterator();
	    while(it.hasNext()){
	       Entry e = (Entry) it.next();
	       System.out.println(e.getKey() +  " "+e.getValue());
	   	
	      
	}	
		
	}
	}

