package TestonHashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
public class Q11 
{


	

	/*
	11.	Flipkart maintains a list<order> from different places .Order has (orderid,city,itemname,status). 
	From this create a Map which stores key has cityname and count as no of order’s pending in that city.
	Data should be sorted according to city.*/
	 
		public static void main(String[] args) {
			//orderid,city,itemname,status
			ArrayList<Order1>al=new ArrayList<Order1>();
			al.add(new Order1(1,"Pune","Phone","Pending"));
			al.add(new Order1(2,"Mumbai","Shoose","Delivered"));
			al.add(new Order1(3,"Nasik","Laptop","Pending"));
			al.add(new Order1(4,"Delhi","TV","Delieverd"));
			al.add(new Order1(5,"Swargate","Phone","Pending"));
			
			
			

			HashMap<String, Integer> tm = new HashMap<String, Integer>();
			for(Order1 o : al)
			{
				String s = o.getCity();
				if(tm.containsKey(s) && o.getStatus().equals("Pending"))
				{
					int v = tm.getOrDefault(s, 0)+1;
					tm.put(s, v);
				}
				else
				{
					if(o.getStatus().equals("Pending"))
						tm.put(s, 1);
				}
			}
			System.out.println(tm);
			
		}

	}


