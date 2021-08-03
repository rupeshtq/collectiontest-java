package TestonHashmap;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Q1Q2Specified {
	
	//1.	Write a Java program to test if a map contains a mapping for the specified
	//va6lue and also test if a map contains a mapping for the specified key.
	public static void main(String[] args) {
		HashMap<Integer,String >hm= new HashMap<Integer, String>();
		hm.put(1, "Akash");
		hm.put(2, "Yogesh");
		hm.put(3, "Sagar");
		hm.put(4, "Ankit");
		
		
		System.out.println(hm);
		System.out.println("Map contains value Akash "+hm.containsValue("Akash"));
		System.out.println("Map contains key 2 "+hm.containsKey(2));
		
		
	//2.	Write a Java program to get the value of a specified key in a map.
		 String val=hm.get(3); 
		   System.out.println("Value for key 3 is: " + val);
		   
		   
		   
		   
		 }
	
	}

