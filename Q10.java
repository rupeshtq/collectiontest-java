package TestonHashmap;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

/*10.	Customer does online shopping to leverage Diwali offers. Shopping list of Customers 
is maintained in following format: ArrayList<Item> Each Item has ID,name,price and qty. 
From ArrayList of Items create a map <String,Integer> where Item Name is key and total 
quantity ordered for that Item as Value. Eg. Items in shpping list are:

[(112,�ParleG�, 20.00, 10),(113,�GoodDay�,40.00,30),
(112,�ParleG�, 20.00, 5),(113,�GoodDay�,40.00,10)]
Then Map would be like this :{{ParleG, 15},{GoodDay,40}}


*/
public class Q10 {
	public static void main(String[] args) {
		ArrayList<Item>al= new ArrayList<>();
		al.add(new Item(112,"ParleG", 20, 10));
		al.add(new Item(113,"GoodDay", 40, 30));
		al.add(new Item(112,"ParleG", 20, 5));
		al.add(new Item(113,"GoodDay",40, 10));
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		for(Item i:al)
		{
			String iname=i.getIname();
			Integer qty=i.getQty();
			if(hm.containsKey(iname))
			{
				int a=hm.get(iname);
				hm.put(iname, a+qty);
				
			}
			else
				
			{
				hm.put(iname, qty);
			}
		}
		System.out.println(hm);
	}

}


